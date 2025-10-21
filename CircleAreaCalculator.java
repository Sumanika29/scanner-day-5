package com.codegnan.fundamentals;

import java.util.Scanner;

public class CircleAreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius of Circle:");
		double r=sc.nextDouble();
		double area = 3.14 * r * r;
		System.out.println("Area of Circle: " + area);
		sc.close();
		

	}

}
