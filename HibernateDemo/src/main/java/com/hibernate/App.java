package com.hibernate;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	 public static void main(String[] args)throws Exception {
		Employee emp = new Employee();
		emp.setEmpId(102);
		emp.setEmpname("Vijaya");

		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txc =  session.beginTransaction();
		session.save(emp);
		txc.commit();
	}
}