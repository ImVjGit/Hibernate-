package com.daySeven.Maven.OntToMany;

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

		Team team = new Team(4, "UK",
				"Really hardworking Team always focus on Positive Point and never bleam other for there failure ",
				player);
		player.add(new Players(120, "Sakoka Olka", team));
		player.add(new Players(13, "Qkona Lalna", team));
		player.add(new Players(142, "Unkia Koabab", team));
		player.add(new Players(16, "Xiabaf Aaolika", team));
		player.add(new Players(217, "Lanyfvw OOOka", team));
		player.add(new Players(318, "Rcvlsms Ppmah", team));
		player.add(new Players(919, "MLsnsk Nssnsn ", team));

		Configuration config = new Configuration();
		config.configure("config.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();

		ses.save(team);
		tx.commit();

		ses.close();
		factory.close();

		System.out.println("Data Save in Table...Successfully ");
	}

}
