package com.tut.ProjectWithMaven03a;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();

		// creating question object
//		Question question = new Question();
//		question.setQuestionId(1);
//		question.setQuestion("What is java??");
//

		// creating Answer object
//		Answer answer = new Answer();
//		answer.setAnswerId(10);
//		answer.setAnswer("java is a programming lang...");
//		answer.setQuestion(question);
//		
//		// creating Answer object1
//		Answer answer1 = new Answer();
//		answer1.setAnswerId(11)
		;
//		answer1.setAnswer("java is a oops based lang...");
//		answer1.setQuestion(question);
//		
//		// creating Answer object1
//		Answer answer2 = new Answer();
//		answer2.setAnswerId(12);
//		answer2.setAnswer("java is a platform independent  lang...");
//		answer2.setQuestion(question);
//
//		List<Answer> ans =new ArrayList<>();
//		ans.add(answer);
//		ans.add(answer1);
//		ans.add(answer2);

		// creating session
//		Session session = factory.openSession();
//		Transaction tx = session.beginTransaction();

		Session session = factory.openSession();

		Question question = (Question) session.get(Question.class, 1);

		System.out.println(question.getQuestion());

		for (Answer a : question.getAnswer()) {
			System.out.println(a);
		}
//		System.out.println(question.getAnswer());
		// save the object

//		session.save(question);
//		session.save(answer);
//		session.save(answer1);
//		session.save(answer2);

//		tx.commit();
//		session.close();
		factory.close();
	}
}
