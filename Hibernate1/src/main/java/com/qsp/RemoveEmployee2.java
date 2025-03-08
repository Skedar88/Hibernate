package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveEmployee2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Employee2 e = em.find(Employee2.class, 10);

		if (e != null) {

			et.begin();
			em.remove(e);
			et.commit();
		} else {
			System.out.println("Id is not present");
		}

	}
}
