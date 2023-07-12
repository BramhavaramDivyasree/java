package HeightConverter;

import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height in inches");
		double height=sc.nextDouble();
		HeightConverter converter = new HeightConverter();

		System.out.printf("%.2f",converter.convertInchesToFeet(height));

	}

}
