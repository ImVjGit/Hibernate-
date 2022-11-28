package com.Maven.Embedded.Entity;

import java.security.cert.Certificate;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudCoursedemo")
public class Student {

	@Id
	@Column(name ="id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "Course")
	private String Course;
	
	@Embedded
	private CertificateOfCourse certi;

	public CertificateOfCourse getCerti() {
		return certi;
	}

	public void setCerti(CertificateOfCourse certi) {
		this.certi = certi;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String course,CertificateOfCourse c1) {
	
		this.id = id;
		this.name = name;
		this.Course = course;
		this.certi= c1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

}
