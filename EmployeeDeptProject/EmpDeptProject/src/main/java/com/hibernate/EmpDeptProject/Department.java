package com.hibernate.EmpDeptProject;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id @Column(name="department_id")
	 private int deptid;
	 
	 private String deptname;
	 
	 @OneToMany
	 private List<Employee> employee;
	 
	 
     //GENERATE GETTER AND SETTER METHOD
	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
    //CONSTRUCTOR
	public Department(int deptid, String deptname, List<Employee> employee) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.employee = employee;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
    
	 

}
