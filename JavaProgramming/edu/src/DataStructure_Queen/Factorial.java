package DataStructure_Queen;

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int n) {
		if(n>0)
			return n*factorial(n-1);
		else
			return 1;
	}
	
	static int gcd(int x, int y) {
		if(y==0) {
			return x;
		}
		else {
			return gcd(y, x%y);
		}
	}
	
	static int fibonacci(int x) {
		if(x==0) return 0;
		if(x==1) return 1;
		return fibonacci(x-1) + fibonacci(x-2);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int x= stdIn.nextInt();
//		int y = stdIn.nextInt();
		
//		System.out.println(x+"팩토리얼은"+factorial(x)+"입니다");
//		System.out.println(x+","+y+" 최소공배수는"+gcd(x,y)+"입니다");
		System.out.println(x+"의 피보나치 결과"+ fibonacci(x));

	}

}
