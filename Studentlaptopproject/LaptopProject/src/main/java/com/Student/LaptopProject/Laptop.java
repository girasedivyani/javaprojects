package com.Student.LaptopProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="Laptop_details")
public class Laptop {
	
	@Id @Column(name="laptop_id")
	private int lapid;
	
	private String lapname;
	
	@OneToOne @JoinColumn(name="student_id")
	private Student student;

	//GENERATE GETTER AND SETTER
	public int getLapid() {
		return lapid;
	}

	public void setLapid(int lapid) {
		this.lapid = lapid;
	}

	public String getLapname() {
		return lapname;
	}

	public void setLapname(String lapname) {
		this.lapname = lapname;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	//CONSTRUCTOR
	public Laptop(int lapid, String lapname, Student student) {
		super();
		this.lapid = lapid;
		this.lapname = lapname;
		this.student = student;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
