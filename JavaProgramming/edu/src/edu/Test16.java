package edu;

public class Test16 {

	public static void main(String[] args) {
//		byte a = 23;
//		int b = a ;
//		System.out.println(b);
//		
//		byte c = 23;
//		short d = 47;
//		int e = 65;
//		int f = c+d+e;
//		System.out.println(f);
//		
//		int g = 23;
//		byte h =(byte) g;
//		System.out.println(h);
//		
//		byte i = 10;
//		byte j = 20;
//		byte k = (byte) (i+j);
//		System.out.println(i+j);
		int n = 10;
		int sum = 0;
		int num = 0;
		int q, answer  = 0;
		for(q = 0 ; q<=n ; q++) {
			if(q%2==1) {
				num = 0;
				
			}
			else{
				num = q;
			
			}
		sum += num;
		answer = sum;
		}
		System.out.println(answer);

			
		}

	
		
	}


class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    }
}

