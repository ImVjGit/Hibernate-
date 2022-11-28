package com.MavenOneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OperationMain {

	public static void main(String[] args) {
		// one Student
		Student std = new Student();
		std.setStudid(1);
		std.setCity("Mumbai");
		std.setName("Ram Pawer");

		// Many Address (village or past stay)
		Address a1 = new Address();
		a1.setId(1);
		a1.setName("Pune");
		a1.setStud(std);

		Address a2 = new Address();
		a2.setId(12);
		a2.setName("Moshi");
		a2.setStud(std);

		Address a3 = new Address();
		a3.setId(11);
		a3.setName("Chakan");
		a3.setStud(std);

		List<Address> list = new ArrayList<Address>();
		list.add(a1);
		list.add(a2);
		list.add(a3);

		std.setA(list);

		Configuration cfg = new Configuration();
		cfg.configure("Hibernet.config.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(std);

		/// fatching
		// Student stri =session.get(Student.class, 1);
		// System.out.println("Stud info :"+stri);

		tx.commit();

		session.close();
		factory.close();
		System.out.println("save it ");
	}
}
