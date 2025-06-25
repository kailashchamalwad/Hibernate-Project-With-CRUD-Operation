package com.A;


import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class StudentClient {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Student.class).configure();
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tt = ss.beginTransaction(); 
		
		Student s = new Student();
		s.setId(3);
		s.setName("Vikas");
		ss.update(s);
		
		System.out.println("Data Inserted Sucessfully");
		
		tt.commit();
		
		
		
		
	}

}
