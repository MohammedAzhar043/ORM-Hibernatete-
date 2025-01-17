package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		
		//creating sawal object
		Sawal s = new Sawal();
		s.setSawalId(1);
		s.setSawalDetails("what is your name???");
		
		//creating jawab object
		Jawab j = new Jawab();
		j.setJawabId(10);
		j.setJawabDetails("My first name  is mohammed ");
		j.setSawal(s);
	
		
		Jawab j1 = new Jawab();
		j1.setJawabId(11);
		j1.setJawabDetails("My middle name is  azhar");
		j1.setSawal(s);

		Jawab j2 = new Jawab();
		j2.setJawabId(12);
		j2.setJawabDetails("My last name is  mansoori");
		j2.setSawal(s);
		
		List<Jawab> jb = new ArrayList<Jawab>();
		jb.add(j);
		jb.add(j1);
		jb.add(j2);
		s.setJawab(jb);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		//save the object
		
		
		session.save(s);
		session.save(j);
		session.save(j1);
		session.save(j2);
		
		
		Sawal ss = (Sawal)session.get(Sawal.class, 1);
		System.out.println(ss.getSawalDetails());
//		System.out.println(ss);
		tx.commit();
		session.close();
		factory.close();

	}

}
