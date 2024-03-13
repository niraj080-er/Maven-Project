package org.jsp.HibernateDemoJPA;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchPhoneNumberOfAllUser {
	public static void main(String[] args) {
		Configuration cgf= new Configuration().configure();
		SessionFactory factory =cgf.buildSessionFactory();
		Session s= factory.openSession();
		Query <User> q= s.createQuery("select e from User e ");
		List <User> user= q.getResultList();
		if(user.size()>0) {
			for (User e : user) {
				System.out.println("User Id is : " +e.getId());
				System.out.println("User Email is : " +e.getPhone());
				System.out.println("---------------------------------");
			}
		}
		
		else {
			System.err.println("Can not find any Email");
		}
	}

}
