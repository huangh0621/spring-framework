package com.hh.test;

import com.hh.app.Appconfig;
import com.hh.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		UserDao bean = context.getBean(UserDao.class);
		bean.query();
		try {
			bean.show("2");

		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

		try {
			bean.show("1234");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		bean.returnString("3");
	}
}
