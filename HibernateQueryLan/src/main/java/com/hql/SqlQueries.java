package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SqlQueries {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();

		Session session = factory.openSession();

		String s = "select * from student";

		NativeQuery nq = session.createNativeQuery(s);

		List<Object[]> stu = nq.list();

		for (Object[] ss : stu) {
//			System.out.println(Arrays.toString(ss));
			System.out.println(ss[1] + " : " + ss[2]);
		}

		session.close();
		factory.close();
	}

}
