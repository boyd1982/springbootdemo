//package com.example.springbootdemo.config;
//
//import com.example.springbootdemo.dao.UserDao;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.mapper.MapperFactoryBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DatabaseConfig {
//    @Autowired
//    SqlSessionFactory sqlSessionFactory = null;
//
//    @Bean
//    public MapperFactoryBean<UserDao> initUserDao(){
//        MapperFactoryBean<UserDao> bean = new MapperFactoryBean<>();
//        bean.setMapperInterface(UserDao.class);
//        bean.setSqlSessionFactory(sqlSessionFactory);
//        return bean;
//    }
//}
