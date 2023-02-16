package com.ruby.java.test1;

public class Exam1 {
	static class sample {
		int a;
	}
	public static int sum(int a, int b) {
		
		int result = a+b;
		System.out.println(result);
		return result;
	}
	
	static void print(int a)  {
		
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 3;
		int result;
		Exam1 ex = new Exam1();
		sample s = new sample();
		s.a = 10;
		
		result = sum(s.a,b);
		print(result);
		
	}

}
