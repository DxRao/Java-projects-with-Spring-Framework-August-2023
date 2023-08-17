package com.drao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drao.dao.DAO;

@Service
public class ServiceProvider {
	
	@Autowired	
	private DAO dao;
	
	public ServiceProvider(){
		
		System.out.println("Service Provider Obj is being created");
		
	}
	
	public void storeInDb(){
		
		boolean status = dao.save();
		
		if (status)
			
			System.out.println("Operation successful");
		
		else
			
			System.out.println("Operation failed");
		
	}
	
}
