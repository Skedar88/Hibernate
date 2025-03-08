package com.qsp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CompEmployee {
	
	@Id
	private int id; 
	private String name;
	private double sal;
	
	@OneToMany
	private List<Company> companies;

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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	public CompEmployee() {
		super();
	}

	@Override
	public String toString() {
		return "CompEmployee [id=" + id + ", name=" + name + ", sal=" + sal + ", companies=" + companies + "]";
	}

}
