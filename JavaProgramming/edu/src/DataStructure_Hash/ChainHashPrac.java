package DataStructure_Hash;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ChainHashPrac {
	
	
	public static void main(String[] args) {
		hash<Integer, String> hs = new hash<>();
		cal c = new cal();
		storage st = new storage();
		
		Scanner kb = new Scanner(System.in);
		int size = 13;
		
		while(true){
			System.out.println("아래 메뉴 중 선택");
			System.out.println("1.insert 2.printAll 3.find 4.delete");
			int ch = kb.nextInt();
			switch(ch) {
				case 1 :
					System.out.print("insert number : ");
					int insertnum = kb.nextInt();
					System.out.println("insert value : ");
					String insertv = kb.next();
					int num = c.divisor(insertnum, size);
					System.out.println(num);
					st.storage(num, insertv);
					break;
					
				case 2 :
					st.print();
					break;
					
				case 3 :
					System.out.print("찾는 value 값 입력 : ");
					String findstring = kb.next();
					st.find(findstring);
			}
		}
	}

}


class hash<K,V> {
	private K key ;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public hash() {
		
	}
	public hash(K key, V value) {
		this.key=key;
		this.value = value;
	}
	public void print(K key, V value) {
		System.out.println(key + "번 키에 저장된 value = " + value);
		
	}
}

class cal {
	private int k;
	private int size;
	public cal() {
		
	}
	public cal(int k, int size) {
		this.k=k;
		this.size=size;
	}
	public int divisor(int k, int size) {
		return k%size;
	}
	
}

class storage{
	private String [] arr = new String[15];
	private int [] point = new int[15];
	private LinkedList<String> lk = new LinkedList<>();
	private String value;
	private int keynum;
	private String n = "-";
	private String vv = "";
	public void set() {
		for(String i : arr) {
			i=n;
		}
	}
	public void storage(int keynum, String value) {
		this.keynum=keynum;
		this.value = value;
		int a =0;
		while(true) {
			if(arr[keynum] == n) {
				arr[keynum] = value;
				System.out.print(keynum + "번 키에 저장된 value = ");
				System.out.println(value);
				break;
			}
			else if(arr[keynum] != n) {
				lk.add(arr[keynum]);
				arr[keynum] = value;
				lk.add(arr[keynum]);
				for(int i=0; i<lk.size();i++) {
					//이거때문에 오류났었음 poll 하기 전에 add 한번 하기

					vv= lk.pop() + vv;
					
				}
				arr[keynum] = vv;
			}
			else {
				arr[keynum] = n;
				System.out.println("기존 값이 존재합니다. 추가 저장하겠습니다");
				
			}
		}
	}
	public void find(String findstring) {
		for(int i=0 ; i< arr.length; i++) {
			if(arr[i].contains(findstring)) {
				System.out.println(i+"키값에 " + findstring+"저장되어있습니다");
				break;
			}
			else {
				continue;
			}
		}
	}
	
	public void print() {
		for(int i=0; i<arr.length;i++) {
			System.out.println(i + "번 " + arr[i]);
		}
	}
	
	
}

