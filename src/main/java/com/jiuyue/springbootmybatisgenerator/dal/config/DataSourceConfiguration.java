package com.jiuyue.springbootmybatisgenerator.dal.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 数据源配置
 * @author hetao
 * @create 2017-12-22
 */
@Slf4j
@Configuration
@MapperScan({"com.submarinegroup.push.dal.mapper", "com.lexus.dal.mapper"})
@EnableConfigurationProperties({DataSourceProperties.class, DataSourceMybatisProperties.class})
public class DataSourceConfiguration {
    @Autowired
    DataSourceProperties dataSourceProperties;
    @Autowired
    DataSourceMybatisProperties dataSourceMybatisProperties;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(dataSourceProperties.getDriver());
        dataSource.setUrl(dataSourceProperties.getUrl());
        dataSource.setUsername(dataSourceProperties.getUsername());
        dataSource.setPassword(dataSourceProperties.getPassword());
        dataSource.setInitialSize(dataSourceProperties.getInitialSize());
        dataSource.setMinIdle(dataSourceProperties.getMinIdle());
        dataSource.setMaxActive(dataSourceProperties.getMaxActive());
        dataSource.setMaxWait(dataSourceProperties.getMaxWait());
        dataSource.setTimeBetweenEvictionRunsMillis(dataSourceProperties.getTimeBetweenEvictionRunsMillis());
        dataSource.setMinEvictableIdleTimeMillis(dataSourceProperties.getMinEvictableIdleTimeMillis());
        dataSource.setValidationQuery(dataSourceProperties.getValidationQuery());
        dataSource.setTestWhileIdle(dataSourceProperties.isTestWhileIdle());
        dataSource.setTestOnBorrow(dataSourceProperties.isTestOnBorrow());
        dataSource.setTestOnReturn(dataSourceProperties.isTestOnReturn());
        dataSource.setPoolPreparedStatements(dataSourceProperties.isPoolPreparedStatements());
        dataSource.setMaxOpenPreparedStatements(dataSourceProperties.getMaxOpenPreparedStatementPerConnectionSize());
        try {
            dataSource.setFilters(dataSourceProperties.getFilters());
        } catch (SQLException e) {
            log.error("druid configuration initialization error", e);
        }
        dataSource.setConnectionProperties(dataSourceProperties.getConnectionProperties());
        return dataSource;
    }

    // 提供SqlSeesion
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(dataSourceMybatisProperties.getMapperLocations()));
        sqlSessionFactoryBean.setConfigLocation(resolver.getResource(dataSourceMybatisProperties.getConfigLocation()));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
