package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertEmployee2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Employee2 e = new Employee2();

		e.setId(20);
		e.setName("Ketan");
		e.setSal(20000);

		et.begin();
		em.persist(e);
		et.commit();
	}

}
