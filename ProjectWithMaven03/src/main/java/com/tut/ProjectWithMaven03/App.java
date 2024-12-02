package com.tut.ProjectWithMaven03;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
        
        Student student = new Student();
        student.setId(1);
        student.setName("Mohammed Azhar");
        student.setCity("kunigal");
        
        Certificate certificate = new Certificate();
        certificate.setCourse("java backend");
        certificate.setDuration("3 months");
        student.setCerti(certificate);
        
        
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Mohammed Azam");
        student2.setCity("Mandya");
        
        Certificate certificate2 = new Certificate();
        certificate2.setCourse("java developer");
        certificate2.setDuration("3 months");
        student2.setCerti(certificate2);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        session.save(student2);
        tx.commit();
		/*
		 * Student s = session.get(Student.class, 1); System.out.println(s.toString());
		 */
        session.close();
        factory.close();
        
    }
}
