package com.lpuproject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private String id;
	private String title;
	private String Description;
	
	public Movie() {
		//default constructor.
	}
	
	public Movie(String id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.Description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
