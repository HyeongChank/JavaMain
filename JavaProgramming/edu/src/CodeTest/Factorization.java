package CodeTest;

import java.util.ArrayList;
import java.util.LinkedList;

public class Factorization {

	public static void main(String[] args) {
		int n =16;
		int answer [] = {} ;
		int div=2;
		//
		LinkedList<Integer> lk = new LinkedList<>();
		while(true) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for(int i=2; i<=n;i++) {
			if(n%i==0) {
				n = n/i;
				lk.add(i);
			}
		}
		int st = lk.size();
		answer = new int[st];
		for(int i=0; i<answer.length;i++) {
			answer[i] = lk.pollFirst();
		}
		for(int i: answer) {
			System.out.println(i);
		}
	}

}
