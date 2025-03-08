package com.qsp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
	
	@Id
	
	private int cid;
	private String name;

	@OneToMany
	
	private List<State1> ind;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<State1> getMh() {
		return ind;
	}

	public void setMh(List<State1> mh) {
		this.ind = ind;
	}

	public Country() {
		super();
	}

	@Override
	public String toString() {
		return "Country [cid=" + cid + ", name=" + name + ", mh=" + ind + "]";
	}
	
	
	
	

}
