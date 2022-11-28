package com.Maven.Embedded.Entity;

import jakarta.persistence.Embeddable;


@Embeddable
public class CertificateOfCourse {

	private int CertId;
	private	String ExamName;

	public CertificateOfCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CertificateOfCourse(int certId, String examName) {
		super();
		CertId = certId;
		ExamName = examName;
	}

	public int getCertId() {
		return CertId;
	}

	public void setCertId(int certId) {
		CertId = certId;
	}

	public String getExamName() {
		return ExamName;
	}

	public void setExamName(String examName) {
		ExamName = examName;
	}

}
