package com.qsp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AadharCard {
	
	@Id
	private int aid;
	private String address;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public AadharCard() {
		super();
	}
	
	

}
