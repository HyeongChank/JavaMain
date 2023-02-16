package edu.mission;

import java.util.Scanner;




public class mission06 {
	
	public static void result(int a, int b) {
		int common = 0;
		int mum = 0;
		int min = (a<b) ? a : b;
		int max = (a>b) ? a :b ;
		

		
	

		for(int i= 0 ; i<3; i++) {
			int rem = max%min;
			if(rem==0) {
				common = min;
				mum = a*b/common;
				
			}
			if(rem !=0) {
				max = min;
				min = rem;
			
			}
	
		}
		System.out.println(common);
		System.out.println(mum);	
		
}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		result(a,b);
		
		
		

	}

}
