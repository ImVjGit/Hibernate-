package com.dayTen.maven.Criteria.Api;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class Getdata {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		//Transaction tx = ses.beginTransaction();
		
		
		CriteriaBuilder builder = ses.getCriteriaBuilder();
		CriteriaQuery<Object[]> query=builder.createQuery(Object[].class);
		Root<Employee> base = query.from(Employee.class);
		
		
		Query<Object[]> q1 = ses.createQuery(query);
		List<Object[]> data = q1.getResultList();
		for (Object[] p : data) {
			System.out.println(p);
		}
		
		
		System.out.println("Data Get it ");

	}

}
