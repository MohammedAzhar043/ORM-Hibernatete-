package com.mapping2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		
		Question1 q1 = new Question1();
		q1.setQuestionId(1);
		q1.setQuestionDetails("What is the islam???");
		
		Answer1 a1 = new Answer1();
		a1.setAnswerId(1);
		a1.setAnswerDetails("Islam is the way of life");
		a1.setQuestion(q1);
	

		Answer1 a2 = new Answer1();
		a2.setAnswerId(2);
		a2.setAnswerDetails("Islam is the only practicing religion on the surface of life");
		a2.setQuestion(q1);
		
		List<Answer1> ans = new ArrayList<Answer1>();
		ans.add(a1);
		ans.add(a2);
		q1.setAnswer(ans);
		
		Session session = factory.openSession();
//		session.beginTransaction();
//		
//		session.save(q1);
//		session.save(a1);
//		session.save(a2);
		Question1 q = (Question1)session.get(Question1.class,1);
		Answer1 a12 = (Answer1)session.get(Answer1.class,1);
//		System.out.println(q.getQuestionDetails());
//		System.out.println(q.getAnswer().size());
//		System.out.println(q.getQuestionId());
		System.out.println(q.getAnswer());
		for(Answer1 a:q.getAnswer()) {
			System.out.println(a.getAnswerDetails());
		}
		
		
//		session.getTransaction().commit();
//		session.close();
		factory.close();
	}

}
