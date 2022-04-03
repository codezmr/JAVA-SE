package com.codezmr.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.codezmr.entity.Employee;

public class Test {

	public static void main(String[] args) throws Exception{
		
		/*
		 
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
		
		*/
		
		
		Class c = Class.forName("com.codezmr.entity.Employee");
		System.out.println("Class Name   : "+ c.getName());
		System.out.println("Super Class  : "+ c.getSuperclass());
		System.out.print("Interfaces   : ");
			Class[] cls = c.getInterfaces();
			for(Class cl: cls) {
				System.out.print(cl.getName()+" ");
			}
			System.out.println();
			
		System.out.print("Variables    : ");
			Field[] flds = c.getDeclaredFields();
			for(Field f: flds ) {
				System.out.print(f.getName()+" ");
			}
			System.out.println();

		System.out.print("Constructors : ");
			Constructor[] cons = c.getDeclaredConstructors();
			for(Constructor con : cons) {
				System.out.print(con.getName()+ " ");
			}
			System.out.println();
			
		System.out.print("Methods      : ");
			Method[] mthds = c.getDeclaredMethods();
			for(Method mt : mthds) {
				System.out.print(mt.getName()+" ");
			}
			System.out.println();
	}

}
