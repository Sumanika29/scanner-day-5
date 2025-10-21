package com.codegnan.fundamentals;

import java.util.Scanner;


public class SimpleInterestandTotalAmountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal Amount:");
		double principal=sc.nextDouble();
		System.out.println("Enter the Rate of Interest:");
		double ratePercentage=sc.nextDouble();
		double ratedecimal=ratePercentage/100.0;
		System.out.println("Enter the Time:");
		double time=sc.nextDouble();
		double simpleInterest=(principal*ratedecimal*time)/100;
		System.out.println("Simple Interest :" + simpleInterest);
		double totalAmount=principal+simpleInterest;
		System.out.println("Total Amount:" + totalAmount);
		
		sc.close();
	}

}
