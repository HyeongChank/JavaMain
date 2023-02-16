package com.ruby.java.ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test03 {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fi = new FileInputStream("a.txt");
		try(fi) {
			
			
		} catch(Exception e) {
			
		} //finally {
//			fi.close();
//			
//		}

	}

}
