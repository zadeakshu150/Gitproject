package basic;

public class Palidrome {

	public static void main(String[] args) {
		int remainder,revnum = 0;
		int n= 4224;
		int temp = n;
		while(n!=0) {
			remainder = n% 10;
			revnum = revnum*10 + remainder;
			n = n/10;
		}
		if(revnum==temp) {
			System.out.println(revnum + " is palidrome ");
		}
		else {
			System.out.println(revnum + " "
					+ "is not palidrome");
		}

	}

}
