package com.tut;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        SessionFactory factory = new Configuration().configure("hibernate.conf.xml").buildSessionFactory();
        
//        System.out.println(factory);
        
        Teacher teach = new Teacher();
        teach.setId(2);
        teach.setAge(26);
        teach.setName("Mohammed shoiab Mansoori");
        teach.setSubject("english");
        
        Session session = factory.openSession();
        
//        session.beginTransaction();
//        session.save(teach);
//        session.getTransaction().commit();
//        session.close();
       Transaction tx = session.beginTransaction();
       session.save(teach);
       tx.commit();
       session.close();
        
//        System.out.println(teach);
        

        
    }
}
