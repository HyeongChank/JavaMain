package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class IterPrac {

	public static void main(String[] args) {
		String [] str1 = {"부산", "서울", "서울", "런던"};
		String [] str2 = {"파리", "서울", "호주"};
		ArrayList <String> al1 = new ArrayList<>(Arrays.asList(str1));
		ArrayList <String> al2 = new ArrayList<>(Arrays.asList(str2));
		ArrayList <String> al3 = new ArrayList<>();
		String [] arr = new String[al1.size()];
		arr = al1.toArray(arr);
		for(String strr : arr) {
			System.out.println(strr);
		}
		Iterator<String> iter1 = al1.iterator();
		Iterator<String> iter2 = al2.iterator();

		String d1, d2 ;
		while(iter1.hasNext()) {
			d1 = iter1.next();
			if(!al3.contains(d1)) {
				al3.add(d1);
			}
			System.out.println(al3);
		}
		while(iter2.hasNext()) {
			d2 = iter2.next();
			if(!al3.contains(d2)) {
				al3.add(d2);	
			}
			System.out.println(al3);
		}
	
		System.out.println("중복 제거 결과 : " + al3);
		Collections.sort(al3);
		System.out.println("정렬 결과 : " + al3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int [] arr1 = {5,4,3,2,10};
		int [] arr2 = {1,3,5,9,8,4,6};
		ArrayList<Integer> arrnum = new ArrayList<>(arr1.length);
		ArrayList<Integer> arrnum2 = new ArrayList<>(arr2.length);
		
	
		for(int num : arr1) {
			arrnum.add(num);
		}
		for(int num : arr2) {
			arrnum2.add(num);
		}
		Iterator<Integer> num1 = arrnum.iterator();
		Iterator<Integer> num2 = arrnum2.iterator();
		
		while(num1.hasNext() && num2.hasNext()) {
			
		}
		
		
		Collections.sort(arrnum);
		System.out.println(arrnum);
		

	}

}
