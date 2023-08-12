package com.drao.first;

public class PaymentProcess {
	
	public PaymentProcess() {
		
		System.out.println("PP Obj is created by Spring Frame Work");		
		
	}
	
	private Ipay pay;

	public void setPay(Ipay pay) {
		
		this.pay = pay;
		
	}
	
	public void processPayment(Double amount) {
		
		boolean status = pay.makePayment(amount);
		
		if(status)
			
			System.out.println("Payment success");
		
		else
			
			System.out.println("Payment failed");
		
	}
}
