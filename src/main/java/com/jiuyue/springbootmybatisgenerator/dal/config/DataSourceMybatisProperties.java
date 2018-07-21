package com.jiuyue.springbootmybatisgenerator.dal.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 数据源的mybatis配置项
 * @author hetao
 * @create 2017-12-22
 */
@Data
@Component
@ConfigurationProperties(prefix = "mybatis")
public class DataSourceMybatisProperties {
    private String mapperLocations;
    private String configLocation;
}
