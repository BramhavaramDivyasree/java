package SemesterMarksAvg;

import java.util.Scanner;

public class SemesterMarksAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter All eight sem marks ");

		int sem1=scan.nextInt();

		int sem2=scan.nextInt();

		int sem3=scan.nextInt();

		int sem4=scan.nextInt();

		int sem5=scan.nextInt();

		int sem6=scan.nextInt();

		int sem7=scan.nextInt();

		int sem8=scan.nextInt();

		System.out.printf("%.2f",calculateAverage(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8));

		

		
		//System.out.printf("%.2f",calculateAverage(85, 79, 91, 76, 88, 95, 80, 85));
		scan.close();
	}
	public static double calculateAverage(double sem1, double sem2, double sem3, double sem4, double sem5, double sem6, double sem7, double sem8) {
		return ((sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8);
	}

}
