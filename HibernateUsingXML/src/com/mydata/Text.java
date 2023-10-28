package com.mydata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Text {
	public static void main (String[] args) {
		try {
			Configuration cfg=new AnnotationConfiguration().configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			
			Employee e = new Employee(105,"Ajay",49000,"Mumbai");
			s.save(e);
			t.commit();
			System.out.println("Done");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
