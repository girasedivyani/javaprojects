package com.hibernate.EmpDeptProject;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Department dept=new Department();
    	dept.setDeptid(101);
    	dept.setDeptname("IT");
    	
    	Employee emp=new Employee();
    	emp.setEmpid(201);
    	emp.setEmpname("Pranali");
    	emp.setEmpposition("HR");
    	emp.setDepartment(dept);
    	
    	
    	Employee emp1=new Employee();
    	emp1.setEmpid(202);
    	emp1.setEmpname("Ashiti");
    	emp1.setEmpposition("Manager");
    	emp1.setDepartment(dept);
    	
    	Employee emp2=new Employee();
    	emp2.setEmpid(203);
    	emp2.setEmpname("Ashwini");
    	emp2.setEmpposition("UI developer");
    	emp2.setDepartment(dept);
    	
    	Employee emp3=new Employee();
    	emp3.setEmpid(204);
    	emp3.setEmpname("Divyani");
    	emp3.setEmpposition("Programmer");
    	emp3.setDepartment(dept);
    	
    	
    	
    	
    	List<Employee> l1=new ArrayList<Employee>();
    	l1.add(emp);
    	l1.add(emp1);
    	l1.add(emp2);
    	l1.add(emp3);
    	dept.setEmployee(l1);
    	
    	
    	
    	
    	
    	
    	
    	
    	Session session=factory.openSession(); 
    	//begin the transaction
    	Transaction tx=session.beginTransaction();
    	session.save(emp);
    	session.save(emp1);
    	session.save(emp2);
    	session.save(emp3);
    	session.save(dept);
    	
    	
    	tx.commit();
    	session.close();
    	factory.close();
    }
}
