package com.mydata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class test {
	public static void main(String[] args) {
		try {
			Configuration cfg = new AnnotationConfiguration().configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			
			Student s1= new Student(101, "Ganesh", "Profound");
			BEstudent s2 = new BEstudent(201,"Amay","Profound", "IT", "7.9");
			BCSstudent s3 = new BCSstudent(301,"Sujay", "Profound", "Comp", 78);
			s.save(s1);
			s.save(s2);
			s.save(s3);
			t.commit();
			System.out.println("Done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
