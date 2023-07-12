package TimeConverter;

import java.util.Scanner;

public class TimeConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the minutes");
		int h=sc.nextInt();
		System.out.printf("%.1f",convertToHours(h));

	}
	public static double convertToHours(int min) {
		return min/60.0;
	}

}
