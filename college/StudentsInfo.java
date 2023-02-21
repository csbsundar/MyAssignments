package org.college;

public class StudentsInfo {
	public void getStudentinfo(int id) {
		System.out.println("The id of the student is" +id);
	}

	public void getStudentinfo(int id,String name) {
		System.out.println("The name of the student is" +name);
	}
	public static void main(String[] args) {
		StudentsInfo object= new StudentsInfo();
		object.getStudentinfo(1234);
		object.getStudentinfo(123,"Sundar");
		
		
				
	}
}
