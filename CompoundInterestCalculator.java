package com.codegnan.fundamentals;

import java.util.Scanner;

public class CompoundInterestCalculator {

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
		System.out.println("Enter the Compund Frequency:");
		int compoundfrequency=sc.nextInt();
		double amount=principal*Math.pow((1+ratedecimal/compoundfrequency),(time*compoundfrequency));
		double compoundInterest=amount-principal;
		System.out.println("Compund Interest :" + compoundInterest);
		double totalAmount=principal+compoundInterest;
		System.out.println("Total Amount:" + totalAmount);
		
		sc.close();
		

	}

}
