package arithmeticOperation;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result1=subtractNumbers(20,5);
		System.out.println(result1);
		int result2=multiplyNumbers(4,5);
		System.out.println(result2);
		double result3=divisionNumbers(20,4);
		System.out.println(result3);
		int result4=findRemainder(10,3);
		System.out.println(result4);

	}
	public static int subtractNumbers(int num1,int num2) {
		return num1-num2;
	}
	public static int multiplyNumbers(int num1,int num2) {
		return num1*num2;
	}
	public static double divisionNumbers(int num1,int num2) {
		return num1/num2;
	}
	public static int findRemainder(int num1,int num2) {
		return num1%num2;
	}

}
