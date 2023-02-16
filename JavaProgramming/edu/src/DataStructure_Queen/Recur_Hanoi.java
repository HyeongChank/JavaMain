package DataStructure_Queen;

import java.util.Scanner;

public class Recur_Hanoi {

	
	static void recur(int n){
		while(n>0) {
			recur(n-1);
			System.out.println(n);
			//n-2를 줌으로써 무한루프에서 나옴
			n = n-2;
		}
	}
	
	static void move(int no, int x, int y) {
		if(no>1)
			move(no-1, x, 6-x-y);
		System.out.printf("원반 %d 를 %d 번 기둥에서 %d번 기둥으로 옮김",no,x,y);
		System.out.println();
		if(no>1)
			move(no-1,6-x-y,y);
		
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
//		recur(n);
		move(n,1,3);
	}

}
