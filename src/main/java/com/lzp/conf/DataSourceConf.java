package com.lzp.conf;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by LZP on 2018/6/17.
 */
@Configuration
public class DataSourceConf {
    @Autowired
    private DBProperties dbProperties;
    @Bean
    public DataSource getDataSource(){
        DruidDataSource druidDataSource =new DruidDataSource();
        druidDataSource.setLoginTimeout(20);
        druidDataSource.setTestWhileIdle(false);
        druidDataSource.setDriverClassName(dbProperties.getDriverClassName());
        druidDataSource.setUrl(dbProperties.getUrl());
        druidDataSource.setUsername(dbProperties.getUsername());
        druidDataSource.setPassword(dbProperties.getPassword());
        return druidDataSource;
    }
    @Bean
    public JdbcTemplate getTemplate(){
        return new JdbcTemplate(getDataSource());
    }
}
