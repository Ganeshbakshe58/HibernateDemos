package com.mydata;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BCSstudent extends Student implements Serializable{
	private String subject;
	private int per;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	public BCSstudent(int roll, String name, String cname, String subject, int per) {
		super(roll, name, cname);
		this.subject = subject;
		this.per = per;
	}
	@Override
	public String toString() {
		return "BCSstudent [subject=" + subject + ", per=" + per + "]";
	}
	
	
}
