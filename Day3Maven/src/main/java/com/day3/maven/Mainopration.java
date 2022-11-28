package com.day3.maven;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Mainopration {

	public static void main(String[] args) {

		// 1 create the object of class
		Player p = new Player(3,"Raja");

		// 2 create the object of Config class for using .config file here
		Configuration conf = new Configuration();
		conf.configure("Config.xml");

		// 3 creating on session FActory for handling multiple session
		SessionFactory factory = conf.buildSessionFactory();

		// 4 open the session here
		Session ses = factory.openSession();

		// 5 use transaction for perform the task
		Transaction tr = ses.beginTransaction();

		// 6 here the the object in session save method
		ses.save(p);

		// 7 use commit method becouase hibernate never auto save
		tr.commit();
		
		// 8  close the session		
		ses.close();
		

	}

}
