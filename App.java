package com.deloitte.emp.hibernate;
import java.util.List;
import java.util.ArrayList;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

/**
 * Hello World!
 * 
 */

public class App
{
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure()
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(SystemEngineer.class)
				.addAnnotatedClass(DeloitteConsulting.class)
				.buildSessionFactory();

//	SystemEngineer se=new SystemEngineer();
//	se.setEmpId(101);
//	se.setDevProfile("Web Dev");
//	se.setEmpName("Manish");
//	se.setLang("Java");
//	
//	
//	DeloitteConsulting dc=new DeloitteConsulting();
//	dc.setEmpId(502);
//	dc.setEmpName("Rohit");
//	dc.setTestProfile("System testing");
//	dc.setTestTech("Selenium");
//	
//	Employee emp=new Employee (101,"Gaurav");
	
	Session ssn=sf.openSession();
	SystemEngineer eng=ssn.get(SystemEngineer.class, 101);
	System.out.println(eng);
//	Transaction tx=ssn.beginTransaction();
//	ssn.save(emp);
//	ssn.save(se);
//	ssn.save(dc);
//	tx.commit();
	ssn.close();
	
	
	}
}




