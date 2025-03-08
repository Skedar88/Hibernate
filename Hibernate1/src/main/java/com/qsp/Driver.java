package com.qsp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Driver {
	
   public static void main(String[] args) {
	
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	   System.out.println(emf);
	   
   }
   

}
