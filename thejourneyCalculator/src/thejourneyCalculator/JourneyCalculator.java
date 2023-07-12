package thejourneyCalculator;

import java.util.Scanner;

public class JourneyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter speed and time as realnumbers");

		double speed=scan.nextDouble();

		double time=scan.nextDouble();

		JourneyCalculator journeyCalculator=new JourneyCalculator();

		System.out.printf("%.2f",journeyCalculator.calculateDistance(speed,time));
		
	}

	
	

}
