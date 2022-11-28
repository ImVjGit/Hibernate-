package com.day9Maveninheritent.TypeTwo;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="Army_Officer")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorValue(value = "Working")
public class ArmyOfficer {
	@Id
	@Column(name = "Army_id")
	private int ArmyId;
	@Column(name = "Army_Name")
	private String Name;
	@Column(name = "Army_Rank")
	private String Rank;

	public ArmyOfficer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArmyOfficer(int armyId, String name, String rank) {
		super();
		ArmyId = armyId;
		Name = name;
		Rank = rank;
	}

	public int getArmyId() {
		return ArmyId;
	}

	public void setArmyId(int armyId) {
		ArmyId = armyId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String rank) {
		Rank = rank;
	}

}
