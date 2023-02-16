package Lesson08;

import java.util.Scanner;

//class Shape {
//	public void area() {
//		
//	}
//	
//}

//class Circle extends Shape {
//	public void area(int r) {
//	System.out.println(3.14 * r * r); 
//	//결과값을 정수로 받는 방법 뭘까?
//
//	}

//	//결과값을 정수로 받는 방법 뭘까?
//
//	}	
//	
//}

//	class Rectangle extends Shape {
//		int w = 2, h = 3;
//
//		public void area() {
//			System.out.println("사각형의 넓이 : " + (w * h));
//		}
//	}
//
//	class Triangle extends Shape {
//		int w = 2, h = 3;
//
//		public void area() {
//		System.out.println("삼각형의 넓이 : " + (w*h/2));
//		}
//	}

public class OverridingTest {
	public static void main(String[] args) {
		

//		
//		Rectangle f = new Rectangle();
//		f.area();
////		
//		Triangle d = new Triangle();
//		d.area();

		Circle c = new Circle();
		
		Scanner kb = new Scanner(System.in);
		int b = kb.nextInt();
		c.setR(b);
	}
}

