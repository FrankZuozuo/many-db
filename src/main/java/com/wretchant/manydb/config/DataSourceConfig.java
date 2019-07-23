package com.wretchant.manydb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author Created by 谭健 on 2019/7/19. 星期五. 10:02.
 * © All Rights Reserved.
 */

@Configuration
public class DataSourceConfig {



    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.rtx")
    public DataSource rtx(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.titan")
    public DataSource titan(){
        return DataSourceBuilder.create().build();
    }
}
