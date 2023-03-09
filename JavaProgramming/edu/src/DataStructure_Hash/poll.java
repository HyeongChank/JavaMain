package DataStructure_Hash;

import java.util.LinkedList;

public class poll {

	public static void main(String[] args) {
		LinkedList<String> lk = new LinkedList<>();
		String [] st = new String[10];
		lk.add("qwe");
		System.out.println(lk);
		String [] st2 = {"1","2qweqwe"};
		if(st2[1].contains("2")) {
			System.out.println(st2[1]);
		}
	
		
		lk.add("asd");
		lk.add("qwe3");
		lk.add("qwe2");
		lk.add("qwe1");
		System.out.println(lk);
		System.out.println(lk.pop());
		System.out.println(lk.poll());
		for(int i =0;i<st.length; i++) {
			st[i] = null;
		}

		
	}

}
