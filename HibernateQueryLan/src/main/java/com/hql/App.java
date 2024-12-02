package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		System.out.println(factory);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		/*
		 * //creating object of student student students = new student();
		 * students.setId(43); students.setName("Mohammed Azhar");
		 * students.setCity("kunigal");
		 * 
		 * 
		 * //creating object of student student students1 = new student();
		 * students1.setId(44); students1.setName("Mohammed anas");
		 * students1.setCity("mandya");
		 * 
		 * //creating object of student student students2 = new student();
		 * students2.setId(45); students2.setName("Mohammed mujahid");
		 * students2.setCity("banglore");
		 * 
		 * 
		 * //creating object of student student students3 = new student();
		 * students3.setId(46); students3.setName("Mohammed junaid");
		 * students3.setCity("tumkur");
		 * 
		 * //creating object of student student students4 = new student();
		 * students4.setId(47); students4.setName("Mohammed masood");
		 * students4.setCity("haven");
		 * 
		 * 
		 * // saving the transaction s.save(students); s.save(students1);
		 * s.save(students2); s.save(students3); s.save(students4);
		 */
		/*
		 * Selecting or fetching the data // String query =
		 * "from student where city='kunigal'";manual String query =
		 * "from student where city=:var "; // String query =
		 * "from student where city=:var and id=:id "; Query q = s.createQuery(query);
		 * q.setParameter("var", "tumkur"); // q.setParameter("id", 46); List<student>
		 * students = q.list();
		 * 
		 * for (student st : students) { System.out.println(st.getName() + " :: " +
		 * st.getCity()); }
		 */

		/*
		 * Query q = s.createQuery("delete from student where city=:x");
		 * q.setParameter("x", "mandya"); int rows = q.executeUpdate();
		 * System.out.println("Deleted..."); System.out.println(rows);
		 */

		/*
		 * Query q1 = s.createQuery("update student set city=:y where city=:z");
		 * q1.setParameter("z", "tumkur"); q1.setParameter("y", "mumbai");
		 * System.out.println("updated....."); int row1 = q1.executeUpdate();
		 * System.out.println(row1);
		 */

		/*
		 * Question question = new Question(); question.setQuestionId(1);
		 * question.setQuestion("what is java???");
		 * 
		 * Answer ans = new Answer(); ans.setAnswerId(10);
		 * ans.setAnswer("java is oops based programming language");
		 * ans.setQuestion(question); question.setAnswer(ans);
		 * 
		 * 
		 * Question question1 = new Question(); question1.setQuestionId(2);
		 * question1.setQuestion("what is c++???");
		 * 
		 * Answer ans1 = new Answer(); ans1.setAnswerId(12); ans1.
		 * setAnswer("c++ is oops based programming language and it is c with classes");
		 * ans1.setQuestion(question1); question1.setAnswer(ans1);
		 * 
		 * 
		 * s.save(question); s.save(question1); s.save(ans1); s.save(ans);
		 */

		Query q = s.createQuery("select q.questionId,q.question,a.answer from Question as q inner join q.answer as a");
		List<Object[]> list1 = q.list();
		for (Object[] arr : list1) {
			System.out.println(Arrays.toString(arr));
		}
		tx.commit();
		s.close();
		factory.close();

	}
}
