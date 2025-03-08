package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TeacherDriver {
	
	public static void main(String[] args) {
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
		
//		Teacher teacher = new Teacher();
//		
//		teacher.setId(10);
//		teacher.setName("Raju");
//		teacher.setPhno(9382468343l);
//		
//		et.begin();
//		em.persist(teacher);
//		et.commit();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em1 = emf.createEntityManager();
		EntityManager em2 = emf.createEntityManager();
		
		em1.find(Teacher.class, 10);
		em1.find(Teacher.class, 10);
		
		em2.find(Teacher.class, 10);
		em2.find(Teacher.class, 10);
		
		
		
	}

}
