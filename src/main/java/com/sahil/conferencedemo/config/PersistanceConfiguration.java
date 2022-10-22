package com.sahil.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistanceConfiguration {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/conference-app");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("Sahil@0508");
        System.out.println("New datasource bean has been created and is being used");
        return dataSourceBuilder.build();
    }
}
