package com.tut.ProjectWithMaven02a;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
//        System.out.println(factory);
        
        Session session = factory.openSession();
        //creating the object of the teacher class
        Teacher teach = new Teacher();
        teach.setId(1);
        teach.setAge(24);
        teach.setName("Mohammed");
        teach.setOnlineClass(false);
        teach.setSubject("urdu");
        teach.setSalary(26800);
        teach.setDob(new Date(14-07-2000));
        
//        FileInputStream fs = new FileInputStream("com/tut/pic.png");
//        byte[] data = new byte[fs.available()];
//        teach.setImage(data);
        
        session.beginTransaction();
        session.save(teach);
        session.getTransaction().commit();
        session.close();
        System.out.println("done...");
        System.out.println(teach);
    }
}
