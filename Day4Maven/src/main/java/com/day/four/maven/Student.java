package com.day.four.maven;



import org.hibernate.annotations.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Rollnumber")
	private int Rollnumber;
	@Column(name="name")
	private String name;


	public Student(int rln, String nm) {
		this.Rollnumber = rln;
		this.name = nm;

	}


	public int getRollnumber() {
		return Rollnumber;
	}


	public void setRollnumber(int rollnumber) {
		Rollnumber = rollnumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	

}
