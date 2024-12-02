package com.tut.ProjectWithMaven02a;

import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Teacher_Details" )
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teachers_id")
	private int id;
	
	@Column(name = "teachers_age")
	private int age;
	
	@Column(length = 10,name = "teachers_name")
	private String name;
	
	@Column(name = "Subject_Which_is_taught_by_the_teacher")
	private String subject;
	
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column(name = "salary_of_the_teacher")
	private double salary;
	
//	@Transient
	private boolean onlineClass;
	
	@Lob
	private byte[] image;

	public Teacher(int id, int age, String name, String subject, Date dob, double salary, boolean onlineClass,
			byte[] image) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.subject = subject;
		this.dob = dob;
		this.salary = salary;
		this.onlineClass = onlineClass;
		this.image = image;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isOnlineClass() {
		return onlineClass;
	}

	public void setOnlineClass(boolean onlineClass) {
		this.onlineClass = onlineClass;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", age=" + age + ", name=" + name + ", subject=" + subject + ", dob=" + dob
				+ ", salary=" + salary + ", onlineClass=" + onlineClass + ", image=" + Arrays.toString(image) + "]";
	}
	

}
