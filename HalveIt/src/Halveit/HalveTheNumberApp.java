package Halveit;

import java.util.Scanner;

public class HalveTheNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		double num=sc.nextDouble();
		System.out.printf("%.2f",halveTheNumber(num));

	}
	public static double halveTheNumber(double num) {
		return num/2;
	}

}
