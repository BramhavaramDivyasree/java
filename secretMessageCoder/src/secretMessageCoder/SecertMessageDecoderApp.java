package secretMessageCoder;

import java.util.Scanner;

public class SecertMessageDecoderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Charcater");
		char c=sc.next().charAt(0);
		MessageDecoder decoder = new MessageDecoder();

		System.out.println(decoder.decodeCharacter(c));

	}
}


