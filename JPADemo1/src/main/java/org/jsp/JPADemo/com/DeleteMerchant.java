package org.jsp.JPADemo.com;

import java.util.Scanner;

import javax.persistence.*;

public class DeleteMerchant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to delete the merchant details ");
		int id = sc.nextInt();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		Merchant m=manager.find(Merchant.class, id);
		if(m!=null) {
			manager.remove(m);
			transaction.begin();
		}else {
			System.err.println("Invalid Id");
		}
		sc.close();

	}

}
