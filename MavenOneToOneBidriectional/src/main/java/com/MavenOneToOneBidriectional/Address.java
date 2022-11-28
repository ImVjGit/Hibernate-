package com.MavenOneToOneBidriectional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@Column(name = "Address_id")
	private int Id;

	private String Name;
	//if i want only one table generate in this class table then i applied (mappBy="column name any") after the oneToOne 
	@OneToOne//(mapped="new name of column any ")
	private Student stud;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pincode, String name,Student stud) {
		super();
		this.Id = pincode;
		this.Name = name;
		this.stud= stud;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

	public int getId() {
		return this.Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

}
