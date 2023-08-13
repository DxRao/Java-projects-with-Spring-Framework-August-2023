package com.drao.first;

public class CreditCard implements Ipay{
	
	public CreditCard() { // Constructor used just to show Credit Card object is created by Spring Framework.
		
		System.out.println("Credit Card Obj is created by Spring Frame Work");		
		
	}
	
	public boolean makePayment(Double amount) {
		
		System.out.println("Making payment through Credit Card and Bill is " + amount);
		
		return true;
	}

}
