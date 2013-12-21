package com.agilysys.pos.domainobjects;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

	private int id;
	private String name;
	private boolean selected;
	private List<Tag> tags;
	private List<MenuItem> items;
	
	public MenuItem() {
		this.tags = new ArrayList<Tag>();
		this.items = new ArrayList<MenuItem>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public List<MenuItem> getItems() {
		return items;
	}
	
	public void setItems(List<MenuItem> items) {
		this.items = items;
	}

	public void addItem(MenuItem item) {
		this.items.add(item);
	}

}
