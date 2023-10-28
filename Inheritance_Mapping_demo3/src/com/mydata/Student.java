package com.mydata;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable{
	private int roll;
	private String name;
	private String cname;
	public Student(int roll, String name, String cname) {
		super();
		this.roll = roll;
		this.name = name;
		this.cname = cname;
	}
	public Student() {}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", cname=" + cname + "]";
	}
	
}
