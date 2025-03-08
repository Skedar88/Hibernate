package com.qsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchAccountDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		Bank bank = em.find(Bank.class, 101);
		
		List<Account> list = bank.getAccs();
		
	
		System.out.println(bank);
		
		System.out.println(".....................................................................................................................");
		
		for (Account account : list) {
			
			System.out.println("..............................");
			
			System.out.println(account);
		}
		
		
	}

}
