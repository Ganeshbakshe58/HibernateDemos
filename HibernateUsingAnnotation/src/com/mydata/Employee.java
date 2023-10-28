package com.mydata;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="h_name")
public class Employee implements Serializable {

			@Id @Column(name="emp_id")
		private int eid;
		private String name;
		private float salary;
		private String address;
		public Employee(int eid, String name, float salary, String address) {
			
			this.eid = eid;
			this.name = name;
			this.salary = salary;
			this.address = address;
		}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
}