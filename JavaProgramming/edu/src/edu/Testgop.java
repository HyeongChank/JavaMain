package edu;

public class Testgop {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] d = new int[3][3];
		int[][] c = new int[3][3];
		int num = 1;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
//				double rnum = Math.random();
//				int num = (int)(rnum *10);

				a[i][j] = num++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
//				double rnum = Math.random();
//				int num = (int)(rnum *10);

				b[i][j] = num++;
			}
		}
		System.out.println("a 행렬\n");
		for(int i =0 ; i<a.length; i++) {
			for (int j =0; j< a[i].length;j++) {
				
				System.out.print(a[i][j]);
				System.out.print("\t");
				
			}
			System.out.println("\n");
		}
		System.out.println("b 행렬\n");
		for(int i =0 ; i<b.length; i++) {
			for (int j =0; j< b[i].length;j++) {
				
				System.out.print(b[i][j]);
				System.out.print("\t");
				
			}
			System.out.println("\n");
		}
		
		for(int i =0; i<d.length; i++) {
			for(int j =0; j<d[i].length;j++) {
				d[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("a+b 행렬\n");
		for(int i =0; i<d.length; i++) {
			for(int j =0; j<d[i].length;j++) {		
				System.out.print(d[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("a*b 행렬\n");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for(int k = 0; k<a[i].length; k++) {
					c[i][j] += a[i][k] * b[k][j];

				
				}

				System.out.print(c[i][j]);
				System.out.print("\t");
			
			}
			
			System.out.println("\n");
		}
		
			
	
	
		

	}
}	

