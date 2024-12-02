package com.tut.ProjectWithMaven02;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;

import javax.swing.text.FlowView.FlowStrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");

		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		System.out.println(factory);

		/*
		 * //creating object of student student students = new student();
		 * students.setId(43); students.setName("Mohammed Azhar");
		 * students.setCity("kunigal");
		 * 
		 * 
		 * //creating object of Address class Address ad = new Address();
		 * 
		 * ad.setStreet("street 1"); ad.setCity("dheli"); ad.setOpen(true);
		 * ad.setAddedDate(new Date(0)); ad.setX(125.2550);
		 * 
		 * //reading image FileInputStream fls = new
		 * FileInputStream("src/main/java/pic.png");
		 * 
		 * byte[] data = new byte[fls.available()]; ad.setImage(data);
		 * 
		 * 
		 * Session session= factory.openSession(); Transaction
		 * tx=session.beginTransaction();
		 * 
		 * session.save(ad); session.save(students); tx.commit(); session.close();
		 */
		System.out.println("Done..");
	}
}
