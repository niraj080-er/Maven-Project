package org.jspider.hibernateDemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FindUserById {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Id ");
		int id= sc.nextInt();
		Configuration cgf= new Configuration().configure();
		SessionFactory factory =cgf.buildSessionFactory();
		Session s= factory.openSession();
		Employee e=s.get(Employee.class, id);
		if(e!=null) {
			System.out.println("Employee Id : " +e.getId());
			System.out.println("Employee Name : " + e.getName());
			System.out.println("Employee Designation: " +e.getDesg());
			System.out.println("Employee salary : " +e.getSalary());
			System.out.println("Employee phone number : " + e.getPhone() );
			
		}
		else {
			System.err.println("You have entred an Invalid ID");
		}
		sc.close();
	}

}
