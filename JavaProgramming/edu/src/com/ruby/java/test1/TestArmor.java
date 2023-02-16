package com.ruby.java.test1;
import com.ruby.java.test1.*;
public class TestArmor {

	
//	static void test(int...v) {
//		System.out.println(v.length + " : ");
//		for(int x:v)
//			System.out.println(x + " ");
//		System.out.println();
//	}	
	
	
	public static void main(String[] args) {
		Armor a= new Armor();
//		a.getName();
//		a.getHeight();
//		a.setisfly();
		a.takeOff(40);
		
		a.test(1);
		a.test(1,2);
		a.test(1,2,3,4,5,6,7,8);
		
		a.speedUp(11,12);
		
//		test(1);
//		test(1,2);
//		test(1,2,3,4,5,6,7);
		
	}

	
}

