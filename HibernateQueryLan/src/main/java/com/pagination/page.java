package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hql.student;

public class page {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		Session s = factory.openSession();
		
		Query q =   s.createQuery("from student");
		
		q.setFirstResult(0);
		q.setMaxResults(10);
		
		List<student> list =   q.list();
		
		for(student ss : list) {
			System.out.println(ss.getName() + " : "+ ss.getCity());
		}
		s.close();
		factory.close();

	}

}
