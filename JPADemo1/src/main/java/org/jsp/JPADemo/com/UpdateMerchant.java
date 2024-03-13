package org.jsp.JPADemo.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateMerchant {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
		EntityManager manager=factory.createEntityManager();
		Merchant m=manager.find(Merchant.class, 1);
		m.setName("Niraj Kumar");
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
		System.out.println("Updated successfully "+ m.getId());
	}

}
