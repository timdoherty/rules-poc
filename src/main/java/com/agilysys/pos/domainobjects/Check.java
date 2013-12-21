package com.agilysys.pos.domainobjects;

import java.util.ArrayList;
import java.util.List;

public class Check {

	private int checkNumber;
	private int seatNumber;
	private List<LineItem> lineItems;
	private List<Payment> payments;
	
	public Check() {
		this.lineItems = new ArrayList<LineItem>();
		this.payments = new ArrayList<Payment>();
	}

	public int getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(int checkNumber) {
		this.checkNumber = checkNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}
	
	public void addLineItem(LineItem lineItem) {
		this.lineItems.add(lineItem);
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
}
