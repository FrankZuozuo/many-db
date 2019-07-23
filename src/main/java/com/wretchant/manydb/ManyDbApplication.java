package com.wretchant.manydb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**
 * 去掉自动配置数据库，因为自动配置的是单数据源
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ManyDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManyDbApplication.class, args);
    }

}
