package com.Student.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int rollno;
	@Column
	private String name;
	@Column
	private float percentag;
	@Column
	private String branch;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, float percentag, String branch) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentag = percentag;
		this.branch = branch;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentag() {
		return percentag;
	}

	public void setPercentag(float percentag) {
		this.percentag = percentag;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentag=" + percentag + ", branch=" + branch + "]";
	}
	
}
