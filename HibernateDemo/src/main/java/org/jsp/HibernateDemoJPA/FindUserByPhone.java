package org.jsp.HibernateDemoJPA;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class FindUserByPhone {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user Phone Number to fetch the User Details ");
		Long uphone=sc.nextLong();
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Query<User> q= s.createQuery("select e from User e where e.phone=:em");
		q.setParameter("em",uphone);
		try {
			User e=q.getSingleResult();
			System.out.println("User Id : " +e.getId());
			System.out.println("User Name : " + e.getName());
			System.out.println("User phone number : " + e.getPhone() );
			System.out.println("User Email is : " + e.getEmail());
		}
		catch (NoResultException e) {
			System.err.println("Invalid User Email");
		} 
		sc.close();
	}

}
