package com.drao.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.drao.dao.DAO;

public class LaunchApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		// context.getBean(DAO.class);

	}

}

 /* OUTPUT:
  
DAO obj is being created
Service Provider Obj is being created
Sending Email obj is being created

*/