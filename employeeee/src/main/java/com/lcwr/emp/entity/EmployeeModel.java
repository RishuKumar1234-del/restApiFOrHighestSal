package com.lcwr.emp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="myEmployees")
public class EmployeeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String name;
	private int age;
	private String department;
	private int salary;
	

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeModel [eid=" + eid + ", name=" + name + ", age=" + age + ", department=" + department
				+ ", salary=" + salary + "]";
	}
	
	
	
	

}
