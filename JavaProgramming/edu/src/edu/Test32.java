package edu;

public class Test32 {

	public static void main(String[] args) {
//		int[] arr = new int[5];
//		int[] arr = { 10, 20, 30, 40, 50 };
//		for(int num : arr) {
//			System.out.println(num);
//		}
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(" " + arr[i]);
//		}
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		int num = 0;
		int [][]arr = new int[5][5];
		for(int i = 0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length;j++) {
				arr[i][j] = num++;
			}
		}	

//		for(int i = 0; i<arr.length; i++) {
//			System.out.println("");
//			for(int j =0; j<arr[i].length;j++) {	
//				System.out.print(arr[i][j]);
//		}

	}
}

