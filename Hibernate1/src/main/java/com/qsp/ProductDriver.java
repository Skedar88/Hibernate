package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Product p = new Product();
		
		p.setId(101);
		p.setName("Iphone");
		p.setPrice(150);
		
		
		Review r1 = new Review();
		
		r1.setId(10);
		r1.setMsg("Bad");
		r1.setProduct(p);
		
		Review r2 = new Review();
		
		r2.setId(11);
		r2.setMsg("Good");
		r2.setProduct(p);
		
		et.begin();
		em.persist(p);
		em.persist(r1);
		em.persist(r2);
		et.commit();
		
	}

}
