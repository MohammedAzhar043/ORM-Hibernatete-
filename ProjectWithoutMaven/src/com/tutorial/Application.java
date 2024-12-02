package com.tutorial;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Project started....");
		
		SessionFactory session = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		System.out.println(session);
		System.out.println(session.isOpen());

	}

}
