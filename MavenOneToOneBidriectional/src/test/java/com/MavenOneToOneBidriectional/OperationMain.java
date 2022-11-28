package com.MavenOneToOneBidriectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class OperationMain {

	public static void main(String[] args) {
//one to one 
		// creating obj
		Address a1 = new Address();
		a1.setId(4);
		a1.setName("Akaokan");
		Student std = new Student(487, "Sanika", "Goa", a1);
		a1.setStud(std);
		// all about starting bootstrap save in db
		Configuration cfg = new Configuration();
		cfg.configure("Hibernet.config.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(std);
		session.save(a1);
		tx.commit();

		session.close();
		factory.close();
		System.out.println("save it ");
	}
}
