package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindEmployee {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Employee2 emp = em.find(Employee2.class, 10);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSal());

	}

}
