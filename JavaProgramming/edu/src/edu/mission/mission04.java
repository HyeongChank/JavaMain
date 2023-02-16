package edu.mission;

public class mission04 {

	
	
	public static void print(int[][] arr) {
		
		for(int i =0; i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("\n");
		}
		
	}
	public static void main(String[] args) {
		int [][] a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int [][] b = {{1,2,3,4},{4,5,6,1},{7,8,9,2}};
		int [][] c = new int[4][4];
		
		print(a);
		System.out.println("\n");
		print(a);
		System.out.println("\n");
		
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<b[0].length; j++) {
				for(int k =0; k<a[i].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]);
				System.out.print("\t");
			
			}
			
			System.out.println("\n");
			
	
		}
	}	

}
