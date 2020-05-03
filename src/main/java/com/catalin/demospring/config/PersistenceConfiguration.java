package com.catalin.demospring.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/first-spring-boot-app");
        builder.username("postgres");
        builder.password("gigibecali2390");
        System.out.println("My custom datasource bean has initialized and set");
        return builder.build();
    }
}
