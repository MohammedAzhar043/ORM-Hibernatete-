package com.tut.ProjectWithMaven02a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class FetchData {

	public static void main(String[] args) {
		
//		get() and load()

		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		System.out.println(factory);
		
		Session session = factory.openSession();

		/*
		 * Student student = new Student(); student.setId(1);
		 * student.setName("Mohammed"); student.setCity("kunigal");
		 * 
		 * session.beginTransaction(); session.save(student);
		 * session.getTransaction().commit(); session.close(); factory.close();
		 */
		Student student=(Student)session.get(Student.class, 4);		
//		Student student1=(Student)session.load(Student.class, 13);		
		System.out.println(student.getName());
		
		
		session.close();
		factory.close();
		
		
	}

}
