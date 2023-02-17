package com.Student.LaptopProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="Student_table")
public class Student {
	@Id @Column(name="student_id")
	private int stuid;
	
	private String stuname;
	
	@OneToOne@JoinColumn(name="Laptop_Id")
	private Laptop laptop;
	
    //GENERATE GETTER AND SETTER
	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	//CONSTRUCTOR
	public Student(int stuid, String stuname, Laptop laptop) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.laptop = laptop;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
