package com.ruby.java.ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test04_Throws_methodcall {

	public static void test() throws FileNotFoundException, IOException {
		FileInputStream fi = new FileInputStream("a.txt");
		int c = fi.read();
		System.out.println((char) c);
	}

	public static void test01() throws FileNotFoundException, IOException {
		test();
	}

	public static void main(String[] args) {
//		FileInputStream fi = new FileInputStream("a.txt");
//		int c = fi.read();
//		System.out.println((char) c);

		try {
			test01();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 없음");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
