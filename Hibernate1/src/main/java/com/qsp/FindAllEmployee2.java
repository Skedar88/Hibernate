package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class FindAllEmployee2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("select e from Employee2 e");

		List<Employee2> employees = query.getResultList();

		for (Employee2 employee : employees) {
			System.out.println("........................");

			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getSal());
		}

	}

}
