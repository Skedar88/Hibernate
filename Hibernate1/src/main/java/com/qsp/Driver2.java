package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver2 {
	
	
	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Trainer t = new Trainer();
		t.setId(88);
		t.setName("Kedarnath");
		
		et.begin();
		em.persist(t);
		System.out.println("Saved");
		et.commit();
	}

}
