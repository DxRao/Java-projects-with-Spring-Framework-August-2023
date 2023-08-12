package com.drao.first;

public class CreditCard implements Ipay{
	
	public CreditCard() {
		
		System.out.println("CC Obj is created by Spring Frame Work");		
		
	}
	
	public boolean makePayment(Double amount) {
		
		System.out.println("Making payment through Credit Card and Bill is " + amount);
		
		return true;
	}

}
