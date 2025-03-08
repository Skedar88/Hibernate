package com.qsp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	
	private int id;
	
	private String name ;
	
	private double bal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", bal=" + bal + "]";
	}

	public Account() {
		super();
	}
	
	
	

}
