package com.example.doubleidea.config;/*
 * Created by ZHANG on 2018/7/30
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Autowired
    Environment env;

    @Bean(name = "one")
    //@ConfigurationProperties(prefix = "spring.datasource.one")
    public DataSource dataSource1(){
        //return DataSourceBuilder.create().build();
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setUrl(env.getProperty("spring.datasource.one.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.one.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.one.password"));
        dataSource.setDriverClassName(env.getProperty("spring.datasource.one.driver-class-name"));

        return dataSource;
    }

/*    @Bean(name = "one")
    @ConfigurationProperties(prefix = "spring.datasource.two")
    public DataSource dataSource2(){
        return DataSourceBuilder.create().build();
    }*/

    @Bean(name = "two")
    //@ConfigurationProperties(prefix = "spring.datasource.one")
    public DataSource dataSource2(){
        //return DataSourceBuilder.create().build();
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setUrl(env.getProperty("spring.datasource.two.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.two.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.two.password"));
        dataSource.setDriverClassName(env.getProperty("spring.datasource.two.driver-class-name"));
        return dataSource;
    }
}
