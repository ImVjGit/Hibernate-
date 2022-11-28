package com.day.four.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainFunction {

	
	public static void main(String[] args) {
	
		
		Student obj = new Student(3,"Rani");
		
		
		Configuration conf = new Configuration();
		conf.configure("config.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		Session sess = factory.openSession();

		Transaction tr =sess.beginTransaction();
		sess.save(obj);
		tr.commit();
		sess.close();
		
		
		
		
//	Practice	
//		Student onj2 = new Student(4,"Sanjay datta");
//		Configuration co =new Configuration();
//		co.configure("config.xml");
//
//		SessionFactory sf = co.buildSessionFactory();
//		Session s2 =sf.openSession();
//		
//		Transaction t =s2.beginTransaction();
//		s2.save(onj2);
//		s2.close();
		
		
	}

}
