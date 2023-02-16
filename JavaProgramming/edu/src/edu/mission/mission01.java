package edu.mission;

import java.util.Scanner;

public class mission01 {

	public static void main(String[] args) {
//		System.out.println("시간를 입력하시오 : ");
//		Scanner kb = new Scanner(System.in);
//		double time = kb.nextDouble();
		double a = 9.81;
		double x = 1000;
		double time;
		double result = 0 ;
		
		
		
		for(time = 0; result>=0 ; time++) {
			result = x - a/2*time*time;
			System.out.println(result);
			if(result<0) {
				break;
			}
		}
		
		
		if(result <0)   System.out.println("오류");
		else            System.out.println(time + "초 후 위치 : " + result+"m");
		
	
		
	
	
		

	}	
}
