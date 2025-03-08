package com.qsp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	
	@Id
	private int id;
	private String name;
	private String loc;
	
	public Company() {
		super();
	}

	@OneToMany
	
	private List<CompEmployee> employees;

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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<CompEmployee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<CompEmployee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", loc=" + loc + ", employees=" + employees + "]";
	}
	

}
