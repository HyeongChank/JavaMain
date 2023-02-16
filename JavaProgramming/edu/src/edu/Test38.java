package edu;

public class Test38 {

	public static void main(String[] args) {
		int[][] a = new int[2][3];
		int[][] b = new int[3][2];
		int[][] c = new int[2][2];

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

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

//	
//				if(i!=j)	arr[i][j] = 0;

				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {

				System.out.print(b[i][j]);
				System.out.print("\t");
			}

			System.out.println("\n");
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int k = 0; k < a[i].length; k++) {
					c[i][j] += a[i][k] + b[k][j];
				}
				System.out.print(c[i][j]);
				System.out.print("\t");
				
			}
			System.out.println("\n");
		}

	}

}
