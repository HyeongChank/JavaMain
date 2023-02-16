package Lesson09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> strlist = new ArrayList<>();
		strlist.add("자바");
		strlist.add("파이썬");
		strlist.add("C");
		System.out.println(strlist);
		
		strlist.set(2, "C++");
		System.out.println(strlist);
		
		Collections.sort(strlist);  //collection . 누르고 나오는 값 엔터해야함
		System.out.println(strlist);
		
		strlist.remove(1);
		System.out.println(strlist);
		
		Iterator<String> iter = strlist.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		ArrayList<Integer> numlist = new ArrayList<>();
		numlist.add(10);
		numlist.add(20);
		for(Integer n : numlist) {
			System.out.println(n);
		}
	}

}
