package edu;

public class NineNine {

	public static void main(String[] args) {
		int s = 0;
		for(int i =1; i<10; i++) {
			System.out.println(i+"단");
			for(int j=1; j<10; j++) {
				System.out.println(i + "*" +j +" = " + i * j);
			}
		}
		while(s<10) {
			s++;
			
		}	
	}

}
