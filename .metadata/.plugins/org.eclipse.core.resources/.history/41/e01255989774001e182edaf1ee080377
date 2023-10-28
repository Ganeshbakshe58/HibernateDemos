package com.mydata;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BEstudent extends Student implements Serializable{
	private String Stream;
	private String grade;
	public BEstudent(int roll, String name, String cname, String stream, String grade) {
		super(roll, name, cname);
		Stream = stream;
		this.grade = grade;
	}
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "BEstudent [Stream=" + Stream + ", grade=" + grade + "]";
	}
	
}
