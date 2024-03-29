package DataStructure_Linkedlist;

import java.util.Scanner;

public class LinkedList_2 {
	static Scanner kb = new Scanner(System.in);
	static int size =0;
	static String [] s1 = new String[5];
	static String s = "-";
	static String [] s2 = new String[5];
	
	public static void Storage(String str, String str2) {

		int num = Integer.valueOf(str);
		s1[num] = str;
		s2[num++] = str2;
		size++;	
		for(int i=0; i<s1.length;i++) {
			System.out.println(s1[i] + "번 " + s2[i]);
		}
		System.out.println();
	}
	public static void Delete(String str) {
		int num = Integer.valueOf(str);
		String str2 = s2[num];
		for(int i =0 ; i< s1.length; i++) {
			if(s1[i].compareTo(str)==0) {
				s1[i] = s;
				s2[i] = s;
				size--;
			}
		}
		System.out.println(str + "번 " + str2 + "삭제");
		Print();

		System.out.println();
	}
	public static void Search(String str) {
		int num = Integer.valueOf(str);
		String str2 = s2[num];
		for(int i=0 ; i<s1.length; i++) {
			if(s1[i].compareTo(str)==0){
				System.out.println("검색됨 " + s1[i]+"번 "+ s2[i] );
				break;
			}
		}
		System.out.println("검색종료");
		System.out.println();
	}
	public static void AutoAdd(String str2) {
		int sq =0;
		while(sq<s1.length) {
			if(s1[sq].compareTo(s)==0) {
				s2[sq] = str2;
				String s = String.valueOf(sq);
				s1[sq] = s;
				size++;
				break;
			}
			sq++;
		}
		Print();
	}
	public static void Print() {
		int i=0;
		while(i<5) {
			if(s1[i] ==s) {
				i++;
				continue;
			}
			else {
				System.out.println(s1[i] +"번 " + s2[i]);
				i++;
			}
		}
	}
	public static void main(String[] args) {
		for(int i =0 ; i<s1.length; i++) {
			s1[i] = s;
			s2[i] = s;
		}
		while(size<=s1.length){
			System.out.println("아래 메뉴 중 선택");
			System.out.println("1.인덱스사용 추가 2.오류확인 3.삭제 4.검색 5.빈인덱스 자동추가 6.print");
			int ch = kb.nextInt();
			switch(ch) {
				case 1 :
					System.out.println("추가할 인덱스");
					String no = kb.next();
					System.out.println("추가할 내용");
					String name = kb.next();
					Storage(no, name);
					break;
					
				case 2 : System.out.println("실행이 됨");
					size++;
					break;
					
				case 3 : 
					System.out.println("삭제할 인덱스");
					String noD = kb.next();
					Delete(noD);
					break;
					
				case 4 :
					System.out.println("검색할 인덱스");
					String noS = kb.next();
					Search(noS);
					break;
				case 5 :
					System.out.println("추가할 내용");
					String nameN = kb.next();
					AutoAdd(nameN);
					break;
				case 6 :
					Print();
					break;
				}
		}	
	}

}
