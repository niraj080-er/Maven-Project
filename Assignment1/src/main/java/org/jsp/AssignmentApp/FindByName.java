package org.jsp.AssignmentApp;

import java.util.List;
import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindByName {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Empoyee Name to fetch the Details ");
		String ename=sc.next();
		Configuration cfg= new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Query <Employee> q= s.createQuery("select e from Employee e where e.name=:nm");
		q.setParameter("nm", ename);
        q.getResultList();
        List<Employee> e=q.getResultList();
		try{
			if(!e.isEmpty()) {
				for (Employee emp : e) {
					System.out.println("Employee Id: " +emp.getId());
					System.out.println("Employee Name" + emp.getName());
					System.out.println("Employee Designation " +emp.getDesg());
					System.out.println("Employee salary " + emp.getSalary());
					System.out.println("Employee Phone number " + emp.getPhone());
				}
		}
			}catch(Exception ex) {
				System.out.println("you have enterd wrong name");
			
		}
        
			
		}
	}
