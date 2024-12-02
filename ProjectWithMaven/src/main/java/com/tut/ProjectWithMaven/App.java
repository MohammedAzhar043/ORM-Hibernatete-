package com.tut.ProjectWithMaven;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Azhar!" );
        
        Configuration conf = new Configuration();
        conf.configure("hibernate.config.xml");
        SessionFactory session = conf.buildSessionFactory();
        System.out.println(session);

        
    }
}
