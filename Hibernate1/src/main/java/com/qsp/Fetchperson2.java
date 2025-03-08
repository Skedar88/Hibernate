package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetchperson2 {
	
	public static void main(String[] args) {
		
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	
	EntityManager em = emf.createEntityManager();
	
	EntityTransaction et = em.getTransaction();
	
	Person p = em.find(Person.class, 10);
	
	AadharCard c = p.getCard();
	
    c.setAddress("India");
    et.begin();
    em.merge(c);
    et.commit();

}
}