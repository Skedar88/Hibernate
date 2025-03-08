package com.qsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CompEmpDriver {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

	public CompEmpDriver() {
//		insertCompEmpData();
//		fetchAllCompEmp();
//		fetchCompEmp();
//		updateCompEmp();
//		removeCompEmp();
//		deleteCompany();
	}

	public void insertCompEmpData() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Company c = new Company();

		c.setId(11);
		c.setName("TCS");
		c.setLoc("Pune");

		CompEmployee emp = new CompEmployee();

		emp.setId(8);
		emp.setName("Kedar");
		emp.setSal(50000.0);

		CompEmployee emp2 = new CompEmployee();
		emp2.setId(10);
		emp2.setName("Jabbar");
		emp2.setSal(80000.0);

		List<Company> list = new ArrayList();
		list.add(c);

		List<CompEmployee> list2 = new ArrayList();

		list2.add(emp);
		list2.add(emp2);

		c.setEmployees(list2);

		et.begin();
		em.persist(c);
		em.persist(emp);
		em.persist(emp2);
		et.commit();

	}

	public void fetchCompEmp() {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		CompEmployee emp = em.find(CompEmployee.class, 8);

		System.out.println(emp.getName());
		System.out.println(emp.getSal());

	}

	public void fetchAllCompEmp() {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query = em.createQuery("select c from Company c");

		List<Company> companies = query.getResultList();

		for (Company company : companies) {
			System.out.println("........................");

			System.out.println(company.getEmployees());
			System.out.println(company.getId());
			System.out.println(company.getName());
			System.out.println(company.getLoc());
			System.out.println("........................");

		}

	}

	public void updateCompEmp() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		CompEmployee emp = em.find(CompEmployee.class, 8);

		emp.setName("Ketan");

		et.begin();
		em.merge(emp);
		et.commit();

	}

	public void removeCompEmp() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		CompEmployee emp = em.find(CompEmployee.class, 8);

		if (emp != null) {

			et.begin();
			em.remove(emp);
			et.commit();
		} else {
			System.out.println("Id is not present");
		}
	}

	public void deleteCompany() {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Company c = em.find(Company.class, 11);

		if (c != null) {
			et.begin();
			em.remove(c);
			et.commit();
			System.out.println("Company Deleted" + "  " + c.getName());
		} else {
			System.out.println("Company not found");
		}

	}

	public static void main(String[] args) {

		new CompEmpDriver();

	}

}
