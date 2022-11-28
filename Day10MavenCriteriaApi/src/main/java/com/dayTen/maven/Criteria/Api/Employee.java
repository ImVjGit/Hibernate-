package com.dayTen.maven.Criteria.Api;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Name=" + Name + ", Dname=" + Dname + ", salary=" + salary + "]";
	}

	@Id
	private int Eid;
	private String Name;
	private String Dname;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, String dname, double salary) {
		super();
		Eid = eid;
		Name = name;
		Dname = dname;
		this.salary = salary;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
