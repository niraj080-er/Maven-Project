package org.jsp.HibernateDemoJPA;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class VerifyUserByIdAndPassword {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the User Id and Password to verify");
		int id=sc.nextInt();
		String password=sc.next();
		Configuration cgf= new Configuration().configure();
		SessionFactory factory =cgf.buildSessionFactory();
		Session s= factory.openSession();
		Query <User> q=s.createQuery("select e from User e where e.id=?1 and e.password=:ps");
		q.setParameter(1,id);
		q.setParameter("ps", password);
		try {
			User e=q.getSingleResult();
			System.out.println("Verification succefull");
			System.out.println("User Id : " +e.getId());
			System.out.println("User Name : " + e.getName());
			System.out.println("User phone number : " + e.getPhone() );
			System.out.println("User Email is : " + e.getEmail());
		}
		catch (NoResultException e) {
			System.err.println("Invalid phone number and password");
		}
		sc.close();
	}

}
