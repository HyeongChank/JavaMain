package edu.mission;

public class mission05 {

	public static int[] merge(int []a, int []b) {
		int len = a.length + b.length;
		int[] c = new int[len];
		int d=0;
		for(int i=0 ; i<a.length ; i++) {
			
			c[d] = a[i];
			d++;
			c[d] = b[i];
			d++;
			
			
		}
		return c;
		
	}
	public static void printArray(int[] e) {
		for(int i =0; i<e.length;i++) {
			System.out.print(e[i]+" ");
		
		}
		System.out.println();
	}
	
	
	
	
	
	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int []b = {1,2,3,4,5};
		
		int []c = new int[10];
		c=merge(a, b);
		merge(a,b);
		printArray(c);
		printArray(a);
		printArray(b);
	}

}
