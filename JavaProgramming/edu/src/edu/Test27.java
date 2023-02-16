package edu;

public class Test27 {

	public static void main(String[] args) {
		for(int i = 8; i<10; i++) {
			System.out.println("for ok");
			
		}
		int j = 10;
		while(j<10) {
			System.out.println("while ok");
			j++;
			
		}
		int k = 5;
		do {
			System.out.println("do-while ok");
			k++;
			System.out.println(k);
		} while(k<10);
	}

}
