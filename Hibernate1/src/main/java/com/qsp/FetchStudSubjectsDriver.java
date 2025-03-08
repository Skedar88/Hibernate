package com.qsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchStudSubjectsDriver {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		Student student = em.find(Student.class, 10);
		
		List<Subject> list = student.getSubjects();
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		
		System.out.println("......................");
		
		for (Subject subject : list) {
			
			System.out.println(subject.getId());
			System.out.println(subject.getSubname());
		}
		
	}
}
