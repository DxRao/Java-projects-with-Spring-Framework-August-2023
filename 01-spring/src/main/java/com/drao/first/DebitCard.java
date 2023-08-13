package com.drao.first;

public class DebitCard implements Ipay{
	
	public DebitCard() {// Constructor used to show Debit Card object is created by Spring Frame work
		
		System.out.println("Debit Card Obj is created by Spring Frame Work");		
		
	}
	
	public boolean makePayment(Double amount) {
		
		System.out.println("Making payment through Debit Card and Bill is " + amount);
		
		return true;
	}

}
