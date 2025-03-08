package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchPersonDriver {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		Person p = em.find(Person.class, 10);
		
		AadharCard c =p.getCard();
				
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPhno());
		System.out.println(c.getAid());
		System.out.println(c.getAddress());
		
		
	}

}
