package CodeTest;

import java.util.HashMap;


class Hash{
	private String key ;
	private String value ;
	private Hash next;
	private int re;
	
	public Hash(String key, String value, Hash next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Hash(int re, Hash next) {
		this.re = re;
		this.next = next;
	}

	public Hash getNext() {
		return next;
	}

	public void setNext(Hash next) {
		this.next = next;
	}

	public int getRe() {
		return re;
	}

	public void setRe(int re) {
		this.re = re;
	}
	
}


public class StringToNum {

	public static void main(String[] args) {
		String numbers = "onefourzerosixseven";
		long answer =0;
		char [] ch = numbers.toCharArray();
		add("one","1");	add("two","2"); add("three","3");
		add("four","4");	add("five","5"); add("six","6");
		add("seven","7");	add("eight","8"); add("nine","9");
		add("zero","0");
		trans(ch);
		int [] array = new int[count];
		int z =0;
		while(inte != null) {
			array[z] = inte.getRe();
			z++;
			inte = inte.getNext();
		}
		String str = "";
		for(int i=array.length-1 ; i>=0; i--) {
			System.out.print(array[i] +  "   ");
			str += String.valueOf(array[i]);
		}
		answer = Integer.valueOf(str);
		System.out.println(answer);
		
	}
	static Hash head;
	static Hash inte;
	static int count=0;

	public static void add(String key, String value) {
		Hash n = head;
		head = new Hash(key, value, n);
	}
	public static void addinte(int re) {
		Hash w = inte;
		inte = new Hash(re, w);
		++count;
		System.out.println("num" + re + "count" + count);

	}
//	public static void print3() {
//		Hash p = inte;
//		while(p != null) {
//			System.out.print(p.getRe());
//			p = p.getNext();
//		}
//	}
//	
//	public static void print() {
//		Hash p = head;
//		while(p != null) {
//			System.out.print(p.getKey());
//			System.out.print("  ");
//			System.out.println(p.getValue());
//			p = p.getNext();
//		}
//	}
//	public static void printV(String key) {
//		Hash p = head;
//		while(p != null) {
//			if(p.getKey()== key) {
//				System.out.println(p.getValue());
//			}
//			p = p.getNext();
//		}
//	}
	public static void trans(char [] ch) {
		Hash q = head;
		String sc="";
		
		for(int i =0; i<ch.length; i++) {
			q = head;
			sc += ch[i];
			while(q != null) {
				if(sc.contains(q.getKey())) {
					int b = Integer.valueOf(q.getValue());
					System.out.print(b+ "  ");
					addinte(b);
					sc ="";
			//이제 poll 만들어서 inte 에 들어간 값 빼고 최종적으로 숫자 붙이면 됨 붙일 때 문자로 하는게 나을수도 
				}
				q = q.getNext();
			}			
		}

	}

}
