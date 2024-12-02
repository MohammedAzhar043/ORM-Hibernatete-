package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hql.student;

public class Pagination {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		Session session = factory.openSession();

		Query q = session.createQuery("from student");

//		implementing the pagination
		q.setFirstResult(0);
		q.setMaxResults(5);
		
		 List<student> list= q.list();
		 
		 for(student s : list) {
			 System.out.println(s.getName()+ " : " + s.getCity());
		 }

		session.close();
		factory.close();
	}

}
