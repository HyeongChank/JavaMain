package CodeTest;

import java.util.ArrayList;
import java.util.Random;

public class ArraylistPractice {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>(10);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.remove(2);
		System.out.println(list);
		Integer [] uarr = list.toArray(new Integer[0]);
		for(int i =0 ; i<uarr.length;i++) {
			System.out.println(uarr[i]);
		}
		

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		System.out.println(arr);
		String[] arr2 = arr.toArray(new String[0]);
		int[] arr3 = new int[arr2.length];
		for (int i = 0; i < arr2.length; i++) {
			arr3[i] = Integer.parseInt(arr2[i]);
			System.out.println(arr3[i]);
		}
		
		
	}

}
