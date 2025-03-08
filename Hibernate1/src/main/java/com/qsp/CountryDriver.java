package com.qsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CountryDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Country con = new Country();
		
		con.setCid(88);
		con.setName("India");
		
		
		State1 mh = new State1();
		mh.setSid(13);
		mh.setName("Maharashtra");
		
		State2 ka = new State2();
		ka.setSid(28);
		ka.setName("Karnataka");
		
     List<Country> list = new ArrayList();
		
		list.add(con);
		
		
		con.setInd(list);
		
		et.begin();
		em.persist(b);
		em.persist(a1);
		em.persist(a2);
		et.commit();
		
	}

}
