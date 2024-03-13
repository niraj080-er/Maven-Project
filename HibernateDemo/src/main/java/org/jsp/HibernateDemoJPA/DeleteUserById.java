package org.jsp.HibernateDemoJPA;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

// delete is not working
public class DeleteUserById {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user Id ");
		int uId=sc.nextInt();
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Query <User> q=s.createQuery("delete e from User e where e.id=?1");
		q.setParameter(1,uId);
		try {
			User e=q.getSingleResult();
			System.out.println("User Id : " +e.getId());
			System.out.println("User Name : " + e.getName());
			System.out.println("User phone number : " + e.getPhone() );
			System.out.println("User Email is : " + e.getEmail());
			System.out.println("User details delete succefull");

		}
		catch(NoResultException e) {
			System.err.println("Invalid ID");
		}
	}

}
