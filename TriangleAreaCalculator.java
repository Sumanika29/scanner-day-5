package com.codegnan.fundamentals;

import java.util.Scanner;

public class TriangleAreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base of the Triangle");
		double base = sc.nextDouble();
		System.out.println("Enter the Height of the Triangle");
		double height = sc.nextDouble();
		double area = 0.5 * base * height;
		System.out.println("Area of Triangle: " + area);
		sc.close();
	}

}
