package com.infy.beans;

public class Employee {
	
	private int empId;
	private String empName;
	private int age;
	private String designation;
	
	/*public Employee(int empId, String empName, int age, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.designation = designation;
	}*/
	
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}


}
