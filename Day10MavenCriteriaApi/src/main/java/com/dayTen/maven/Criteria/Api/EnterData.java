package com.dayTen.maven.Criteria.Api;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EnterData {

	public static void main(String[] args) {
		Employee e1 = new Employee(152, "Ram pawar", "Comp", 150000);
		Employee e2 = new Employee(52, "Madhvi Nabiar", "IT", 15000);
		Employee e3 = new Employee(12, "Gaouri Kamlo", "Mech", 1000);
		Employee e4 = new Employee(2, "Polika tanikar", "Civil", 5000);
		Employee e5 = new Employee(1, "Rutika Bohnadli", "Hr", 11000);
		Employee e6 = new Employee(10, "Sayli Gaikawad", "Admin", 14000);
		Employee e7 = new Employee(92, "Hanika Ramsethu", "Entc", 13000);

		Configuration cfg = new Configuration();
		cfg.configure("config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();
		ses.persist(e1);
		ses.persist(e2);
		ses.persist(e3);
		ses.persist(e4);
		ses.persist(e5);
		ses.persist(e6);
		ses.persist(e7);
		tx.commit();

		ses.close();
		factory.close();

		System.out.println("Data save ");
	}

}
