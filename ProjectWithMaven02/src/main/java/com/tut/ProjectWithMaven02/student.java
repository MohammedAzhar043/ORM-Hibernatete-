package com.tut.ProjectWithMaven02;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {

	@Id
	private int id;
	private String name;
	private String city;

	public student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
