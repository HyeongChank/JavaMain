package com.ruby.java.ch14.Interface;

import java.util.Arrays;

//interface MyFunc<T>{
//	T modify(T t);
//}
//interface NumberFunc{
//	int func(int n);
//}
public class Test06 {

	public static void main(String[] args) {
//		NumberFunc sum = (n) ->{
//			int result =0;
//			for(int i =0; i<n; i++) {
//				result += 1;
//			}
//			return result;
//		};
//			MyFunc<String> a = (str) -> ":" + str.length();
//			System.out.println(a.modify("java"));
//			MyFunc<Integer> b = (n) -> n*2;
//			System.out.println(b.modify(23));
//			(T, t) -> {return a +b};
//		System.out.println(sum.func(100));
		
//	}
		int [] num = {1,2,3,4,5};
		int sum = Arrays.stream(num).filter((n) -> n%2 ==1).sum();
		System.out.println(sum);
	}	

}
