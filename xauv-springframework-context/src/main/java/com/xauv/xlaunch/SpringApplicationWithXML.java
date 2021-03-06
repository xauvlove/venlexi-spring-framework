package com.xauv.xlaunch;

import com.xauv.springframework.context.dao.SpringXMLDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationWithXML {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		SpringXMLDao springXMLDao = (SpringXMLDao)context.getBean("springXMLDao");
		springXMLDao.doDao();
	}
}
