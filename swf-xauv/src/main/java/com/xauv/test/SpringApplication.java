package com.xauv.test;

import com.xauv.config.AppConfig;
import com.xauv.dao.MyDao;
import com.xauv.dao.SpringXMLDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 初始化 spring 环境的三种方法
 * 1. xml, {@link ClassPathXmlApplicationContext}
 * 2. annotation, {需要借助 1或3 完成包扫描}:
 * 	               具体做法：context.scan("com.xauv");
 * 3. javaconfig, {@link AnnotationConfigApplicationContext}
 */
public class SpringApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		// 注册 {@link Configuration 类型}
		context.register(AppConfig.class);
		context.refresh();
		MyDao myDaoImpl = (MyDao)context.getBean("myDaoImpl");
		myDaoImpl.doDao();
		SpringXMLDao springXMLDao = (SpringXMLDao)context.getBean("springXMLDao");
		springXMLDao.doDao();
	}
}