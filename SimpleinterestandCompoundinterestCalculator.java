package com.codegnan.fundamentals;

import java.util.Scanner;

public class SimpleinterestandCompoundinterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal Amount:");
		double principal=sc.nextDouble();
		System.out.println("Enter the Rate of Interest:");
		double ratePercentage=sc.nextDouble();
		double ratedecimal=ratePercentage/100.0;
		System.out.println("Enter the Time in months:");
		double timeInMonths=sc.nextDouble();
		double timeInYears=(double)timeInMonths/12;
		double simpleInterest=(principal*ratedecimal*timeInYears)/100;
		System.out.println("Simple Interest:" + simpleInterest);
		double totalWithSimpleInterest=principal+simpleInterest;
		System.out.println("Total with Simple Interest: "+ totalWithSimpleInterest);
		double compoundInterest=principal*(Math.pow((1+ratedecimal/100),timeInYears))-principal;
		System.out.println("Compound Interest:" + compoundInterest);
		double totalWithCompoundInterest=principal+compoundInterest;
		System.out.println("Total with Compound Interest: "+ totalWithCompoundInterest);
		sc.close();

	}

}
