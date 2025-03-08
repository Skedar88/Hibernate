package com.qsp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State2 {
	
	@Id
	
	private int sid;
	
	private String name;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State2() {
		super();
	}

	@Override
	public String toString() {
		return "State2 [sid=" + sid + ", name=" + name + "]";
	}
	
	
	
	

}
