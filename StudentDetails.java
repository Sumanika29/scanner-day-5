package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name=sc.next();
		System.out.println("Enter the Roll Number:");
		int rollNumber=sc.nextInt();
		System.out.println("Enter the Age:");
		int age=sc.nextInt();
		System.out.println("Enter the Grade:");
		String grade=sc.next();
		System.out.println("Student Details:"+ name +","+ rollNumber + ","+ age + ","+ grade);
		sc.close();

	}

}
