package basic;

public class Swap1 {

	public static void main(String[] args) {
		System.out.println(" swap number without using temporary variable");
		int num1 = 100;
		int num2 = 150;
		num2 = num1 + num2; //250

		
		
		num1 = num2 - num1; //50
		num2 = num2 - num1;
		System.out.println(" num is " + num1);
		System.out.println(" num is " + num2);
		

	}

}
