package com.drao.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DAO {
	
	public DAO(){
		
		System.out.println("DAO obj is being created");
		
	}
	
	public boolean save() {
		
		System.out.println("Data saved in database");
		
		return true;
	}

}
