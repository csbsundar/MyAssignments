package org.college;

public class Student extends Department {
	public static void main(String[] args) {
		Student object=new Student();
		object.collegeName();
		object.collegeCode();
		object.collegeRank();
		object.departmentName();
		object.studentDept();
		object.studentId();
		object.studentName();
		
	}
	public void studentName() {
		System.out.println("Student name");
	}
	public void studentDept() {
		System.out.println("Student department");
	}
	public void studentId()	{
		System.out.println("Student id");
	}
}
