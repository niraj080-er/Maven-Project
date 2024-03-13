package org.jsp.JPADemo.com;

import java.util.Scanner;

import javax.persistence.*;

public class FindMerchantById {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Merchant ID to display the Merchant Details ");
		int id=sc.nextInt();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
		EntityManager manager=factory.createEntityManager();
		Merchant m=manager.find(Merchant.class, id);
		if(m!=null) {
			System.out.println(m);
		}else {
			System.err.println("Invalid Id ");
		}
	}
}
