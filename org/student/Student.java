package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Pravin");		
	}

	public void studentDept() {
		System.out.println("Selenium-Java");
	}
	
	public void studentId() {
		System.out.println("22-SJ-13");
	}
	
	public static void main(String[] args) {
		
		Student studDetails = new Student();
		studDetails.collegeName();
		studDetails.collegeCode();
		studDetails.collegeRank();
		studDetails.deptName();
		studDetails.studentName();
		studDetails.studentDept();
		studDetails.studentId();

	}

}
