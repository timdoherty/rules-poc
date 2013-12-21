package com.agilysys.pos.domainobjects;

import java.math.BigDecimal;

public class Payment {
	
	private int id;
	private BigDecimal amount;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
