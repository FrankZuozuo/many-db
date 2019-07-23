package com.wretchant.manydb.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author Created by 谭健 on 2019/7/19. 星期五. 10:06.
 * © All Rights Reserved.
 */

@Configuration
@MapperScan(basePackages = "com.wretchant.manydb.mapper.rtx",sqlSessionFactoryRef = "sessionFactoryRTX" )
public class RTXMyBatisDataSourceConfig {


    @Bean
    @Primary
    public SqlSessionFactory sessionFactoryRTX(@Qualifier("rtx")DataSource dataSource)throws Exception{
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        return sessionFactoryBean.getObject();
    }

    @Bean
    @Primary
    public SqlSessionTemplate sessionTemplateRTX(@Qualifier("sessionFactoryRTX") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
