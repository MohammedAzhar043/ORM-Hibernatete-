package com.tut.ProjectWithMaven01a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World hi azhar!");

		SessionFactory Factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		// System.out.println(session);
		// creating a student
		Student st = new Student();
		st.setId(12);
		st.setName("Mohammed Azhar");
		st.setCity("Kunigal");
		System.out.println(st);

		Session session = Factory.openSession();

       session.beginTransaction();
       session.save(st);
       session.getTransaction().commit();
		// or
//		Transaction tx = session.beginTransaction();
//
//		session.save(st);
//		tx.commit();

		session.close();
	}
}
