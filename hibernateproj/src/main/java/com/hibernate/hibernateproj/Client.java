package com.hibernate.hibernateproj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args)
	{
	     Configuration cfg = new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     SessionFactory factory = cfg.buildSessionFactory();
	     Session session = factory.openSession();
	     Transaction tx = session.beginTransaction();
	     Employee e1=new Employee();    
	     e1.setId(101);    
	     e1.setName("Ganesh");        
	         
	     session.save(e1);  
	     System.out.println("Object saved successfully.....!!");
	     tx.commit();
	     session.close();
	     factory.close();
	     
	}

}
