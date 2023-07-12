package TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temperature");
	    double t=sc.nextDouble();
		TemperatureConv temperatureConverter = new TemperatureConv();

		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(t));

	}

}
