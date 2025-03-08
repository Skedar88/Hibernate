package com.qsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertAccountDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et  = em.getTransaction();
		
		
		Bank b = new Bank();
		
		b.setId(101);
		b.setName("SBI");
		b.setBranch("Pune");
		
		
		Account a1 = new Account();
		
		a1.setId(10);
		a1.setName("Jabbu");
		a1.setBal(3.5);
		
		Account a2 = new Account();
		
		a2.setId(11);
		a2.setName("Adhu");
		a2.setBal(7);
		
		List<Account> list = new ArrayList();
		
		list.add(a1);
		list.add(a2);
		
		b.setAccs(list);
		
		et.begin();
		em.persist(b);
		em.persist(a1);
		em.persist(a2);
		et.commit();
		
		
	}

}
