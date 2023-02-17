package com.Student.LaptopProject;

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
       // System.out.println( "Hello World!" );
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Student stu=new Student();
    	stu.setStuid(101);
    	stu.setStuname("Divyani");
    	
    	Student stu1=new Student();
    	stu1.setStuid(102);
    	stu1.setStuname("Ashwini");
    	
    	Student stu2=new Student();
    	stu2.setStuid(103);
    	stu2.setStuname("Ashiti");
    	
    	
    	Laptop l1=new Laptop();
    	l1.setLapid(201);
    	l1.setLapname("HP");
    	stu.setLaptop(l1);
    	l1.setStudent(stu);
    	
    	Laptop l2=new Laptop();
    	l2.setLapid(202);
    	l2.setLapname("Dell");
    	stu1.setLaptop(l2);
    	l2.setStudent(stu1);
    	
    	Laptop l3=new Laptop();
    	l3.setLapid(203);
    	l3.setLapname("Lenovo");
    	stu2.setLaptop(l3);
    	l3.setStudent(stu2);
    	
    	
    	
    	Session session=factory.openSession(); 
    	//begin the transaction
    	Transaction tx=session.beginTransaction();
    	session.save(stu);
    	session.save(l1);
    	session.save(stu1);
    	session.save(l2);
    	session.save(stu2);
    	session.save(l3);
    	tx.commit();
    	session.close();
    	factory.close();
    }
}
