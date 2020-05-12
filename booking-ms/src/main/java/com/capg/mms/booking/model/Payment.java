package com.capg.mms.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table
public class Payment {
	//@Column
	private String paymentmethod;
//	private String googlepay;
	private long phonenumber;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Payment(String paymentmethod, long phonenumber) {
		super();
		this.paymentmethod = paymentmethod;
		this.phonenumber = phonenumber;
	}


	public String getPaymentMethod() {
		return paymentmethod;
	}

	public void setPaymentMethod(String PaymentMethod) {
		this.paymentmethod = PaymentMethod;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "Payment [paymentmethod=" + paymentmethod + ", phonenumber=" + phonenumber + "]";
	}
	
}
