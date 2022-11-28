package com.jcp.mvc;
//POJO class - Plan old Java object (simple level )
public class User {
	String user;
	String Password;
	String Cpass;
	String email;
	
	public User()
	{
		
	}
	public User(String name  ,String pass,String cpass ,String email)
	{
		this.user=name ;
		this.Password= pass;
		this.Cpass=cpass;
		this.email=email;
		
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return Password;
	}
	public void setPass(String pass) {
		Password = pass;
	}
	public String getCpass() {
		return Cpass;
	}
	public void setCpass(String cpass) {
		Cpass = cpass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//its only for demo 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getUser();
	}
	
	
	
	
}
