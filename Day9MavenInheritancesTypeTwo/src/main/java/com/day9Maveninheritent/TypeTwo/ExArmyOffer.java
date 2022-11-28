package com.day9Maveninheritent.TypeTwo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Ex_Army_Officer")
//@DiscriminatorValue(value = "Retire")
public class ExArmyOffer extends ArmyOfficer{


	@Column(name = "Last_Posting")
	private String Last_Posting_State;

	public ExArmyOffer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public ExArmyOffer(int id ,String nm,String rank, String last_Posting_State) {
		super(id,nm,rank);
		
		Last_Posting_State = last_Posting_State;
	}




	public String getLast_Posting_State() {
		return Last_Posting_State;
	}

	public void setLast_Posting_State(String last_Posting_State) {
		Last_Posting_State = last_Posting_State;
	}

}
