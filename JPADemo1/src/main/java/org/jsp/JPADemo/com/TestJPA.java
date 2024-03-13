package org.jsp.JPADemo.com;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("development");
		System.out.println(factory);
	}

}
