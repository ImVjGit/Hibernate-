package com.hibernet.practice.wihout.xml.day.four;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainFunction {

	public static void main(String[] args) {
	
		Employee e = new Employee(105,"Rohit Rao", "Mechanical", 10000);
		e.setSalary(5000);
		
		Configuration conf = new Configuration();
		conf.configure("Config.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tr = ses.beginTransaction();
	    ses.save(e);
	//	ses.remove(e);
		
		tr.commit();
		ses.close();
		

	}

}
