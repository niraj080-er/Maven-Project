package org.jsp.HibernateDemoJPA;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name :");
		String uName=sc.next();
		System.out.println("Enter the user Phone Number : ");
		Long uPhone=sc.nextLong();
		System.out.println("Enter the use Email-Id : ");
		String uEmail=sc.next();
		System.out.println("Enter the user Password : ");
		String uPass=sc.next();
		Configuration cgf= new Configuration().configure();
		SessionFactory factory =cgf.buildSessionFactory();
		Session s= factory.openSession();
		User u=new User();
		u.setEmail(uEmail);
		u.setName(uName);
		u.setPhone(uPhone);
		u.setPassword(uPass);
		s.update(u);
		Transaction tc= s.beginTransaction();
		tc.commit();
	}
}
