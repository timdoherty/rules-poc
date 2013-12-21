package com.agilysys.pos.domainobjects;

public class LineItem {

	private int itemId;
	private double percentage;
	
	public LineItem() {
		
	}
	
	public LineItem(int itemId, double percentage) {
		this.itemId = itemId;
		this.percentage = percentage;
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}
