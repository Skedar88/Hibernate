package com.qsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SubjectDriver {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		Subject s1 = new Subject();

		s1.setId(101);
		s1.setSubname("Java");

		Subject s2 = new Subject();

		s2.setId(102);
		s2.setSubname("SQL");

		Student st1 = new Student();

		st1.setId(10);
		st1.setName("Virat");

		List<Subject> list = new ArrayList();

		list.add(s1);
		list.add(s2);

		st1.setSubjects(list);

		Student st2 = new Student();

		st2.setId(11);
		st2.setName("Rohit");
		
		st2.setSubjects(list);
		
		et.begin();
		
		em.persist(st1);
		em.persist(st2);
		em.persist(s1);
		em.persist(s2);
		et.commit();

	}

}
