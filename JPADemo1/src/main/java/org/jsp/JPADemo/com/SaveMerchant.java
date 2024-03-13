package org.jsp.JPADemo.com;

import java.util.Scanner;

import javax.persistence.*;
public class SaveMerchant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Merchant m = new Merchant();
		System.out.println("Enter the Merchant Name : ");
		String mName=sc.nextLine();
		System.out.println("Enter the Merchant Email : ");
		String mEmail=sc.nextLine();
		System.out.println("Enter the Merchant Password : ");
		String mPassword=sc.nextLine();
		System.out.println("Enter the Merchant GST Number : ");
		String mGst= sc.nextLine();
		System.out.println("Enter the Merchant Phone Number : ");
		Long mPhone=sc.nextLong();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager = factory.createEntityManager();
		m.setName(mName);
		m.setPhone(mPhone);
		m.setGst_number(mGst);
		m.setPassword(mPassword);
		m.setEmail(mEmail);
		manager.persist(m);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
		System.out.println("Merchant save with an id:- "+m.getId());
		sc.close();

	}

}