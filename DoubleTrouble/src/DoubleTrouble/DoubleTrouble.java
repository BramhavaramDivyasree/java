package DoubleTrouble;

import java.util.Scanner;

public class DoubleTrouble {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(doubleTheNumber(num));
		
		
	}
	public static int doubleTheNumber(int num) {
		return num*2;
	}

}
