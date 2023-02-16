package com.ruby.java.ch10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class Test07 {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("고진", "고생 끝에");
		dic.put("분골", "몸이부서진");
		dic.put("권토", "실패를");
		dic.put("교학", "가릐고");
		dic.put("null", "null");
		
		Iterator<String> keys = dic.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}
		
//		for(Map.Entry<String, String> elem : dic.entrySet());
//		System.out.println(String.format("%s : %s", elem.getKey(), elem.getValue()));
		
		for(String key : dic.keySet()) {
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}
		

	}

}
