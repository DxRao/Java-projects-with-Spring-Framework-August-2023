package com.drao.first;

public class DebitCard implements Ipay{
	
	public DebitCard() {
		
		System.out.println("DC Obj is created by Spring Frame Work");		
		
	}
	
	public boolean makePayment(Double amount) {
		
		System.out.println("Making payment through Debit Card and Bill is " + amount);
		
		return true;
	}

}
