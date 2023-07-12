package FinanceCalculator;

import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of Principal,rate,time");
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		double t=sc.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();

		System.out.printf("%.2f",calculator.calculateSimpleInterest(p, r, t));

	}

}
