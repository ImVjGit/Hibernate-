package com.dayMaven.inherent.TypeThree;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {

	public static void main(String[] args) {

		//creating the object and store the data in Databases
		ExArmyOffer ex = new ExArmyOffer(426, "Yakamna Rajehsa", "Ex Carnal", "Jamu & Kashmir");
		ArmyOfficer ARM = new ArmyOfficer(15462, "Rajshkhar Arora ", "Carnal");
		ExArmyOffer ex1 = new ExArmyOffer(1212, "Harshal Yadav", "Ex officer", "Punjab");
		ArmyOfficer ARM1 = new ArmyOfficer(14752, "Taniksa Varma ", "Jr.Officer");
		ExArmyOffer ex2 = new ExArmyOffer(6, "Kailash Tanika", "Sr Officer", "Manali");
		ArmyOfficer ARM2 = new ArmyOfficer(46265, "Saorhana Kalonakia", "Sr.Officer");
		ExArmyOffer ex3 = new ExArmyOffer(666, "Vinod Kamble", "Ex Carnal", "Gujarat");
		ArmyOfficer ARM3 = new ArmyOfficer(4265, "Hana Lonakia", "Carnal");
		ArmyOfficer ARM4 = new ArmyOfficer(6265, "Aarhana Nakia", "Sr.Officer");

		//creating connection with Databases and store data 
		Configuration config = new Configuration();
		config.configure("config.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(ARM1);
		ses.save(ex);
		ses.save(ARM2);
		ses.save(ex1);
		ses.save(ARM);
		ses.save(ex3);
		ses.save(ex2);
		ses.save(ARM3);
		ses.save(ARM4);
		tx.commit();
		ses.close();
		factory.close();
		System.out.println("Data Save Successfully In Databases...");
	}

}
