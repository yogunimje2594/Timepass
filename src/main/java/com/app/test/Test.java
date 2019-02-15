package com.app.test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Employee;
import com.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Transaction tx=null;
		try(Session ses=HibernateUtil.getSf().openSession()) {
			tx=ses.beginTransaction();
			Employee emp=new Employee();
			emp.setEmpName("Yogesh");
			emp.setEmpSal(12000);
			String id=(String)ses.save(emp);
			System.out.println("Here is your id "+id);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}
}
