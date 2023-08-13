package com.drao.first;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class LaunchApp1 {

	public static void main(String[] args) {
		
		//Resource res = new ClassPathResource("beans.xml");
		
		//BeanFactory factory = new XmlBeanFactory(res);
		
		//factory.getBean("credit", CreditCard.class);
		
		//factory.getBean("debit", DebitCard.class);
		
		//factory.getBean("pp", PaymentProcess.class);
		
		//////////////////////////////////////////////////////////////////////
		
		/* Alternatively, latest spring versions use the following syntax   */
		
		//////////////////////////////////////////////////////////////////////
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//context.getBean("debit", DebitCard.class); // All 3 class objects are created with one statement	
		
		
		PaymentProcess pp = context.getBean("pp", PaymentProcess.class);
		
		pp.processPayment(101.5);
		
	}

}
