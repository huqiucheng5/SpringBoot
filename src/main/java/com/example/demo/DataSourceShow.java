package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2019/1/24.
 */
@Component
public class DataSourceShow implements ApplicationContextAware {

    private ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        DataSource dataSource = this.applicationContext.getBean(DataSource.class);
        System.out.println("------------------------------------------------");
        System.out.println(dataSource.getClass().getName());
        System.out.println("------------------------------------------------");
    }
}
