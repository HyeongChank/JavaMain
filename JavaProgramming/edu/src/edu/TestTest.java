package edu;

public class TestTest {

	public static void main(String[] args) {
//		int [][]a = new int[2][3];
//		int [][]b = new int[3][2];
		int [][]a = {{1,2,3},{1,2,3}};
		int [][]b = {{1,2},{2,3},{3,4}};
//		a[0][0] = 1;
//		a[0][1] = 2;
//		a[0][2] = 3;
//		a[1][0] = 1;
//		a[1][1] = 3;
//		a[1][2] = 2;
//		b[0][0] = 1;
//		b[0][1] = 2;
//		b[1][0] = 3;
//		b[1][1] = 1;
//		b[2][0] = 3;
//		b[2][1] = 2;
		int [][]c = new int[2][2];
		

		for(int i=0;i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
		System.out.println("\n");
		}
		
		for(int i=0;i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]);
				System.out.print("\t");
			}
		System.out.println("\n");
		}
		
		for(int i =0; i<a.length; i++) {
			for(int j = 0 ;j<b[i].length;j++
					) {
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


