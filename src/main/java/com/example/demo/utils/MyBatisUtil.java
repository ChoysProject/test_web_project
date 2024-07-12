package com.example.demo.utils;
import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan("com.example.demo.mapper")
public class MyBatisUtil {

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);

        Resource[] resources;
        try {
            resources = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml");
            sessionFactory.setTypeAliasesPackage("com.example.demo.model");
            sessionFactory.setMapperLocations(resources);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sessionFactory.getObject();
    }
}