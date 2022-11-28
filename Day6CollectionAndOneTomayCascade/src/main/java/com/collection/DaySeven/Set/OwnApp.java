package com.collection.DaySeven.Set;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OwnApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Players> player = new HashSet();
		player.add(new Players(50, "Piter Kami"));
		player.add(new Players(51, "Lala olina"));
		player.add(new Players(252, "Pokima Larana"));
		player.add(new Players(15, "loki Aaolika"));
		player.add(new Players(21, "Thor kokalia"));
		player.add(new Players(31, "Maplaia Goka"));
		player.add(new Players(91, "Mr Been"));
		
		Team team = new Team(4, "UK", "Really hardworking Team always focus on Positive Point and never bleam other for there failure ",player);
		
		Configuration config = new Configuration();
		config.configure("config.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(team);    
		tx.commit();
		
		
		
		ses.close();
		factory.close();
		
		
		
		

	}

}
