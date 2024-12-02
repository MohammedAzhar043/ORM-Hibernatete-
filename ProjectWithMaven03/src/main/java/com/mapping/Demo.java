package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
		
//		Configuration con = new Configuration();
//		con.configure("hibernate.confiq.xml");
//		SessionFactory factory = con.buildSessionFactory();
		
		
		 SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
	
		//creating question object
		Question question = new Question();
		question.setQuestionId(1);
		question.setQuestion("What is java??");

		
		//creating Answer object
		Answer answer = new Answer();
		answer.setAnswerId(10);
		answer.setAnswer("java is a programming lang...");
		answer.setQuestion(question);
		question.setAnswer(answer);
		
		
		//creating session 
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		//save the object
		session.save(question);
		session.save(answer);
		
		tx.commit();
		session.close();
		factory.close();
	}

}
