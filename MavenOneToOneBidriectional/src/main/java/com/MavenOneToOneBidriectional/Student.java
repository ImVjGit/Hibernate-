package com.MavenOneToOneBidriectional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@Column(name = "Studnet_id")
	private int Studid;
	
	private String name;

	private String city;

	@OneToOne
	private Address a;

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studid, String name, String city, Address aa) {
		super();
		this.Studid = studid;
		this.name = name;
		this.city = city;
		this.a = aa;
	}

	public int getStudid() {
		return this.Studid;
	}

	public void setStudid(int studid) {
		this.Studid = studid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
