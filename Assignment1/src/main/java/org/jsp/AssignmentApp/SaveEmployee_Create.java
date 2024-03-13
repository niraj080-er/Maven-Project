package org.jsp.AssignmentApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmployee_Create {
	public static void main(String[] args) {
		Employee e= new Employee();
		e.setName("Bitu kumar");
		e.setDesg("Transpose-Head");
		e.setPhone(98775698L);
		e.setSalary(750000.00);
		e.setPassword("Bittu@123");
		Configuration cgf= new Configuration().configure();
		SessionFactory factory =cgf.buildSessionFactory();
		Session s= factory.openSession();
		int id=(Integer)s.save(e);
		Transaction t=s.beginTransaction();
		t.commit();
		System.out.println("Employee record has been saved with Id : " + id);
	}

}
