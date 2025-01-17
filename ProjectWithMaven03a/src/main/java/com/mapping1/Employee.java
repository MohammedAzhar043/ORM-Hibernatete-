package com.mapping1;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int empId;
	@Column(name = "Employee_ID")
	private String empName;
	@ManyToMany
	@JoinTable(name = "emp_learn", joinColumns = { @JoinColumn(name = "Employee_Id") }, inverseJoinColumns = {
			@JoinColumn(name = "Project_ID") })
	private List<Project> project;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public Employee(int empId, String empName, List<Project> project) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.project = project;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
