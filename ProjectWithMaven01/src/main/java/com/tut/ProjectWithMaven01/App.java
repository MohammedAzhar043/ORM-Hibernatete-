package com.tut.ProjectWithMaven01;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Azhar!" );
        SessionFactory ss = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
        System.out.println(ss);
        
        
    }
}
