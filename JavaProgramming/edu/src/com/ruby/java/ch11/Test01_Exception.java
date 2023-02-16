package com.ruby.java.ch11;

public class Test01_Exception {

	
	public static void test01() {
		try {
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length();
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("OK");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 배열의 인덱스 사용");

		} catch (NullPointerException e2) {
			e2.printStackTrace();
			e2.getMessage();
			e2.toString();
		}
//		} catch (Exception e) {
//			System.out.println("오류남");
//		}
		System.out.println("good");
	}

		
	public static void test() {
		test01();
	}
	public static void main(String[] args) {
		test();

	}

}
