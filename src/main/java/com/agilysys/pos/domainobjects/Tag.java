package com.agilysys.pos.domainobjects;

import java.util.Hashtable;
import java.util.UUID;

public class Tag {
	private UUID id;
	private String name;
	private String description;
	private Hashtable<String, Object> attributes;
	
	public Tag() {
		this.id = UUID.randomUUID();
		this.attributes = new Hashtable<String, Object>();
	}
	
	public Tag(UUID id) {
		this.id = id;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Hashtable<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Hashtable<String, Object> attributes) {
		this.attributes = attributes;
	}
	
	public void addAttribute(String key, Object value) {
		this.attributes.put(key, value);
	}
}
