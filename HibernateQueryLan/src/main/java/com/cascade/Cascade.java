package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Cascade {

	public static void main(String[] args) {
	

		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		
		Question1 q1 = new Question1();
		q1.setQuestionId(158);
		q1.setQuestionDetails("what is your fav show??");
		
		Answer1 ans1 = new Answer1();
		ans1.setAnswerId(48);
		ans1.setAnswerDetails("my fav show is bhaut khub..");
		ans1.setQuestion(q1);
		
		
		Answer1 ans2 = new Answer1();
		ans2.setAnswerId(528);
		ans2.setAnswerDetails("my fav show is current affair..");
		ans2.setQuestion(q1);
		
		List<Answer1> ans = new ArrayList<Answer1>();
		ans.add(ans1);
		ans.add(ans2);
		q1.setAnswer(ans);
		
		session.beginTransaction();
		
		session.save(q1);
	
		
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
