package com.MavenOneToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	@Column(name = "Address_id")
	private int Id;

	private String Name;

	@ManyToOne
	private Student stud;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

	public Address(int id, String name, Student stud) {
		super();
		Id = id;
		Name = name;
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
