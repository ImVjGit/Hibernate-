package com.MavenOneToMany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@Column(name = "Studnet_id")
	private int Studid;

	private String name;

	private String city;

	@OneToMany (mappedBy="stud")
	private List<Address> a;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Address> getA() {
		return a;
	}

	public void setA(List<Address> a) {
		this.a = a;
	}

	public Student(int studid, String name, String city, List<Address> a) {
		super();
		Studid = studid;
		this.name = name;
		this.city = city;
		this.a = a;
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
