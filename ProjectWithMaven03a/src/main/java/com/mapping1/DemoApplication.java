package com.mapping1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoApplication {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		//creating the employee object
		Employee e = new Employee();
		Employee e1 = new Employee();
		e.setEmpId(1);
		e.setEmpName("mohammed azhar");
		e1.setEmpId(2);
		e1.setEmpName("mohammed azam");
		 
		//creating the project object
		Project p1= new Project();
		Project p2 = new Project();
		
		p1.setPid(10);
		p1.setPname("bus management system");
		
		p2.setPid(20);
		p2.setPname("Employee management system");

		
		List<Employee> list1 = new ArrayList<Employee>();
		List<Project> list2 = new ArrayList<Project>();
		
		list1.add(e);
		list1.add(e1);
		
		list2.add(p1);
		list2.add(p2);
		
		e.setProject(list2);
		p2.setEmp(list1);
		
		//creating the session
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		//save the data
		
		session.save(e);
		session.save(e1);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		session.close();
		factory.close();
		
	}

}
