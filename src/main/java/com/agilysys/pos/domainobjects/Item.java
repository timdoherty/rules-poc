package com.agilysys.pos.domainobjects;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Item {

	private int id;
	private String name;
	private int qty;
	private BigDecimal amount;
	private boolean selected;
	private List<Tag> tags;
	private List<Item> items;
	
	public Item() {
		this.tags = new ArrayList<Tag>();
		this.items = new ArrayList<Item>();
	}
	
	public Item (int id, String name, int qty, BigDecimal amount, boolean selected, List<Tag> tags, List<Item> items) {
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.amount = amount;
		this.selected = selected;
		this.tags = tags;
		this.items = items;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Tag> getTags() {
		return tags;
	}
	
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public void addTag(Tag tag){
		this.tags.add(tag);
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

}
