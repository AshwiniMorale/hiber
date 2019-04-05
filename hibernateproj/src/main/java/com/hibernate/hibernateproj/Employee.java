package com.hibernate.hibernateproj;

import javax.persistence.*;

@Entity
@Table
public class Employee
{
	@Id
	int id;
	@Column
	String name;
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
	

}
