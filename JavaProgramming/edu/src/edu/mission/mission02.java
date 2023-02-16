package edu.mission;
import java.util.Scanner;

public class mission02 {

	public static void main(String[] args) {
		
		
//		while(true) {
			
			int m50 = 0, m10 = 0, m5 = 0, m1 = 0, diff;
						
			System.out.println("금액 입력");
			Scanner kb = new Scanner(System.in);
			int pay = kb.nextInt();
			
			if(pay/50000>0) {m50 = pay/50000; pay -= 50000*m50;
				System.out.println(pay);
			}
			if(pay/10000>0) {m10 = pay/10000; pay -= 10000*m10;
				System.out.println(pay);
			}
			
			if(pay/5000>0) {m5 = pay/5000; pay -= 5000*m5;
				System.out.println(pay);
			}
			if(pay/1000>0) {m1 = pay/1000; pay -= 1000*m1;
			}
			diff = pay;
			
	//		if(pay == 0 ) break;
	//		int m50 = pay / 50000;
	//		pay -= m50 * 50000;
	//		int m10 = pay / 10000;
	//		pay -= m10 *10000;
	//		int m5 = pay / 5000;
	//		pay -= m5 * 5000;
	//		int m1 = pay / 1000;
	//		pay -= m1 * 1000;
			System.out.println("5만원권 " + m50 + " 1만원권 " + m10 + " 5천원권 " + m5 + " 1천원권 " + m1 +" 잔액 " +diff);
		}
	}
			


