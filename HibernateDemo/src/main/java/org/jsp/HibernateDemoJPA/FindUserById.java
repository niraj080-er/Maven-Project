package org.jsp.HibernateDemoJPA;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FindUserById {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Employee Id : ");
		int id= sc.nextInt();
		Configuration cgf= new Configuration().configure();
		SessionFactory factory =cgf.buildSessionFactory();
		Session s= factory.openSession();
		User u=s.get(User.class, id);
		if(u!=null) {
			System.out.println("User Id : " +u.getId());
			System.out.println("User Name : " + u.getName());
			System.out.println("User phone number : " + u.getPhone() );
			System.out.println("User Email is : " + u.getEmail());
		}
		else {
			System.err.println("You have entred an Invalid ID");
		}
		sc.close();
	}

}
