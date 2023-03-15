package CodeTest;

import java.util.HashMap;


class Hash{
	private String key ;
	private String value ;
	private Hash next;
	
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

	public Hash() {
		
	}

	public Hash getNext() {
		return next;
	}

	public void setNext(Hash next) {
		this.next = next;
	}
	
}


public class StringToNum {

	public static void main(String[] args) {
		String number = "nineonetwothreefourfivesixseveneightnine";
		long answer =0;
		add("one","1");	add("two","2"); add("three","3");
		add("four","4");	add("five","5"); add("six","6");
		add("seven","7");	add("eight","8"); add("nine","9");
		printV("one");
		trans("onetwothreefourfivesixseveneightnine");
	}
	static Hash head;
	public static void add(String key, String value) {
		Hash n = head;
		head = new Hash(key, value, n);
	}
	public static void print() {
		Hash p = head;
		while(p != null) {
			System.out.print(p.getKey());
			System.out.print("  ");
			System.out.println(p.getValue());
			p = p.getNext();
		}
	}
	public static void printV(String key) {
		Hash p = head;
		while(p != null) {
			if(p.getKey()== key) {
				System.out.println(p.getValue());
			}
			p = p.getNext();
		}
	}
	public static void trans(String key) {
		Hash q = head;
		while(q != null) {
			if(key.contains(q.getKey())) {
				printV(q.getKey());
			}
			q = q.getNext();
		}
	}

}
