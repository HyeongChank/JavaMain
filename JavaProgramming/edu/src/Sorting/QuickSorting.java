package Sorting;

import DataStructure_Queen.Point;

class Point {
		private int ix;
		private int iy;

		public Point(int x, int y) {
			ix = x;
			iy = y;
		}

		public int getX() {
			return ix;
		}

		public int getY() {
			return iy;
		}

		public void setX(int x) {
			ix = x;
		}

		public void setY(int y) {
			iy = y;
		}
	}
	
	class MyStack{
		private int top ;
		Point [] p;
		public MyStack() {
			top =0;
			p = new Point[100];
		
		}
		public boolean isEmpty() {
			if(top ==0)
				return true;
			else
				return false;
		}
		public void push(Point po) {
			p[top++] = po;
			
		}
		public Point pop() {
			return p[--top];
		}

		
	}
	public class QuickSorting {


	//퀵 정렬(비재귀 버전)

		// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
		static void swap(int[] a, int idx1, int idx2) {
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}

		// --- 퀵 정렬(비재귀 버전)---//
		static void quickSort(int[] a, int left, int right) {
			int ln = left;
			int rn = right;
			int x = a[(ln+rn)/2];
			MyStack ms = new MyStack();
			Point pt = new Point(left, right);
			while(ln<=rn) {
			
				while(a[ln]<x) ln++;
				while(a[rn]>x) rn--;
				if(ln<=rn) {
					swap(a, ln++, rn--);
				}
				
			} 
		
		}

		public static void main(String[] args) {
			int nx = 10;
			int[] x = new int[10];
			for (int ix = 0; ix < 10; ix++) {
				double d = Math.random();
				x[ix] = (int) (d * 20);
			}
			for (int i = 0; i < nx; i++)
				System.out.print(" " + x[i]);
				System.out.println();

			quickSort(x, 0, nx - 1); // 배열 x를 퀵정렬

			System.out.println("오름차순으로 정렬했습니다.");
			for (int i = 0; i < nx; i++)
				System.out.print(" " + x[i]);
		}
	}