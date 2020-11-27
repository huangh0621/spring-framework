package com.hh.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	public void query() {
		System.out.println("query db");
	}

	public void show(String str) throws Exception {
		if ("2".equals(str)) {
			throw new Exception(str);
		}
		System.out.println(str + "================");
	}

	public String returnString(String str1) {
		return ">>" + str1;
	}
}
