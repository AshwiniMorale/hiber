package com.hibernate.hibernateproj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	//public void save1(int id, String name) method for servlet
	public void save1(Employee emp) 
	{
	     System.out.println("Save() calles");
	     Configuration cfg = new Configuration();
	     cfg.configure();
	     SessionFactory factory =null;
	     Session session=null;
	     try
	     {
	    	 factory = cfg.buildSessionFactory();
	    	 session = factory.openSession();
	     }catch (Exception e) {
	    	 System.out.println(e);
	     }
	     Transaction tx = session.beginTransaction();
	     System.out.println("Transection Begin");
	    /* code for servlet
	      Employee e1=new Employee();    
	     e1.setId(id);     
	     e1.setName(name);        
	    */     
	     session.save(emp);  
	     System.out.println("Object saved successfully.....!!");
	     tx.commit();
	     session.close();
	     factory.close();
	     
	}

}
