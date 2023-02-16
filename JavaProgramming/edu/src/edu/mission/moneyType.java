package edu.mission;

import java.util.Scanner;

public class moneyType {
		int m50;
		int m10;
		int m5;
		int m1;
		int payb;  //잔액
		int pay;
		
		
		
		
		public void firstM() {
			m50 = pay/50000;
		}
		
		public void SecondM() {
			m10 = pay/10000;
			
		}
		public void thirdM() {
			m5 = pay/ 5000;
		}
		public void forthM() {
			m1 = pay/1000;
		}
		public int lastM() {
			return payb;
		}
}
