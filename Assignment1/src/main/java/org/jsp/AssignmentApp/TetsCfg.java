package org.jsp.AssignmentApp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TetsCfg {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory= cfg.buildSessionFactory();
		System.out.println(factory);
	}
}
