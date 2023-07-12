package StringJoiner;

import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String sttr2=sc.next();
		String res=joinStrings(str1,sttr2);
		System.out.println(res);

	}
	public static String joinStrings(String str1, String str2) {
		return str1+str2;
	}

}
