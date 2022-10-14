package basic;

public class Swap4 {

	public static void main(String[] args) {
		int num1=50;
		int num2=100;
		int temp=num1+num2;//50+100=150
		num1 = temp-num1;//150-50=100
		num2=temp-num1;//150-100=50
		System.out.println("num1 is " +num1);
		System.out.println("num2 is " +num2);

	}

}
