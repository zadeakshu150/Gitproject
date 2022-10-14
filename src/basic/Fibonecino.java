package basic;

public class Fibonecino {

	public static void main(String[] args) {
		int a=0,b=1;
		int d;
		for(int i=1;i<=10;i++) {
			int c1 =a+b;
			System.out.print(" "+c1);
			a=b;
			b=c1;
		}

	}

}
