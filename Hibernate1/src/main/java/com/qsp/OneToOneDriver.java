package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setId(10);
		p.setName("Raju");
		p.setPhno(888);
		
		AadharCard ac = new AadharCard();
		
		ac.setAid(101);
		ac.setAddress("China");
		
		//Giving Aadhar card to person
		
		p.setCard(ac);
		
		et.begin();
		em.persist(ac);
		em.persist(p);
		et.commit();
	}

}
