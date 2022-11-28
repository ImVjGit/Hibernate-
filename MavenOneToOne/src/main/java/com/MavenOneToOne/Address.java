package com.MavenOneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	@Column(name = "Address_id")
	private int Id;

	private String Name;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pincode, String name) {
		super();
		this.Id = pincode;
		this.Name = name;
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
