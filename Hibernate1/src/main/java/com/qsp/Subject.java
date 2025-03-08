package com.qsp;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {

	@Id
	private int id;
	
	private String subname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public Subject() {
		super();
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", subname=" + subname + "]";
	}
	
	
	
	
	
}
