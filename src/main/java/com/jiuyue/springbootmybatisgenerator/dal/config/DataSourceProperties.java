package com.jiuyue.springbootmybatisgenerator.dal.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 数据源的参数
 * @author hetao
 * @create 2017-12-22
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceProperties {
    private String driver;
    private String url;
    private String username;
    private String password;
    private int initialSize;
    private int minIdle;
    private int maxActive;
    private int maxWait;
    private int timeBetweenEvictionRunsMillis;
    private int minEvictableIdleTimeMillis;
    private String validationQuery;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;
    private boolean poolPreparedStatements;
    private int maxOpenPreparedStatementPerConnectionSize;
    private String filters;
    private String connectionProperties;
}
