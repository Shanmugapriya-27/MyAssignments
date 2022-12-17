package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Priya");
	}
	public void studentDept() {
		System.out.println("IBT");
	}
	public void studentId() {
		System.out.println("101");
	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		stu.studentDept();
		stu.studentId();
		stu.studentName();
	}
}
