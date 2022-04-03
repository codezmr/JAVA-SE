package com.codezmr.test;

import com.codezmr.entity.Employee;

public class Test {

	public static void main(String[] args) throws Exception{
		
		//First Approach
		Class c1 = Class.forName("com.codezmr.entity.Employee");
		System.out.println(c1.getName());
		
		//Second Approach
		Employee emp = new Employee();
		Class c2 = emp.getClass();
		System.out.println(c2.getName());
		
		//Third Approach
		Class c3 = Employee.class;
		System.out.println(c3.getName());
		
	}

}
