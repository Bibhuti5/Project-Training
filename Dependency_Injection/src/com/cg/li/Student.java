package com.cg.li;

public class Student {

	String studentName;
	Integer id;
	String Address;
	
	

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", id=" + id + "]";
	}

	public void displayStudentInfo() {
		System.out.println("Student id is"+id);
        System.out.println("Student name is "+studentName );	
        System.out.println("Address is "+Address);
        
	}
	
}