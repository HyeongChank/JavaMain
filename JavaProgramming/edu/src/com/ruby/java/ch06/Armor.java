package com.ruby.java.ch06;

import java.util.Scanner;

public class Armor {
	private String name;
	private int height;
	private int weight;
	private String color;
	private boolean isFly;
	
	
	
	
	public boolean getTrue() {
		return isFly;
	}
	public void setTrue(boolean value) {
		isFly = value;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String value) {
		name = value;
	
		
	
	}
	public int getHeight(){
		return height;
	}
	public void setHeight(int value) {
		height = value;
		
		
	}
//	public void setweight() {
//		System.out.println("몸무게");
//		Scanner kb3 = new Scanner(System.in);
//		weight = kb3.nextInt();
//		
//	}
//	public void setcolor() {
//		System.out.println("색깔");
//		Scanner kb4 = new Scanner(System.in);
//		weight = kb4.nextInt();
//	}
//	public void setisfly() {
//		System.out.println("비행 가능/불가능");
//		Scanner kb5 = new Scanner(System.in);
//		weight = kb5.nextInt();
//		
//		
//		System.out.println("이름 : " +name);
//		System.out.println(name+" : " +height);
//	}
//	public int takeOff(int value) {
//		System.out.println("엔진 시동: value = "+ value);
//		return value ;
//	}
//	public static void test(int...v) {
//		System.out.print(v.length + " : ");
//		for(int x:v)
//			System.out.print(x + " ");
//		System.out.println();
//	}	
//	
//	double speed;
//	public void speedUp(double value) {
//		speed = value;
//		System.out.println(speed);
//	}
//	public void speedUp(int value, int maxValue) {
//		int speed = value;
//		int maxSpeed = maxValue;
//		System.out.println(speed);
//	}
	
	
}
