package com.agilysys.pos.domainobjects;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private String orderNumber;
	private String tableNumber;
	private List<Item> items;
	private List<Check> checks;
	
	public Order() {
		this.items = new ArrayList<Item>();
		this.checks = new ArrayList<Check>();
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}

	public List<Check> getChecks() {
		return checks;
	}

	public void setChecks(List<Check> checks) {
		this.checks = checks;
	}
	
	public void addCheck(Check check) {
		this.checks.add(check);
	}
	
}
