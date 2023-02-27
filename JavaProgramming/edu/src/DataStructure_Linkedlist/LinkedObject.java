package DataStructure_Linkedlist;

//단순한 linked list에서 insert, delete하는 알고리즘을 코딩: 1단계

import java.util.Scanner;

class SimpleObject {
	private String no;
	private String name;
	static int length =0;

	public SimpleObject(String no, String name) {

		this.no = no;
		this.name = name;
	}

	public SimpleObject() {
		// TODO Auto-generated constructor stub
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SimpleObject [no=" + no + ", name=" + name + "]";
	}


	

}

class LinkedList2 {
	

	static SimpleObject arr = new SimpleObject();
	public static boolean Delete(int element) // delete the element
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr == element) {
				arr[i] = 0;
				return true;
			}
		}
		for (int i : arr) {
			System.out.print(i + "  ");
		}
		return false;
	}

	public void Show() { // 전체 리스트를 순서대로 출력한다.
		for (int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
	public static void Add(String no, String name) // 임의 값을 삽입할 때 리스트가 오름차순으로 정렬이 되도록 한다
	{
		if (num < arr.length) {
			arr.setNo(no);
			arr.setName(name);
			
		}
	}

	public static boolean Search(int data) { // 전체 리스트를 순서대로 출력한다.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return true;
			}

		}
		return false;
	}


}

public class LinkedObject {
	enum Menu {
		Add("삽입"), Delete("삭제"), Show("인쇄"), Search("검색"), Exit("종료");

		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) { // 생성자(constructor)
			message = string;
		}

		String getMessage() { // 표시할 문자열을 반환
			return message;
		}
	}

	// --- 메뉴 선택 ---//
	static Menu SelectMenu() {
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = sc.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		SimpleObject lo = new SimpleObject();
		
		lo.length=0;
		int num = 0;

		System.out.println(lo);
		Menu menu; // 메뉴
		System.out.println("Linked List");
		LinkedList2 l = new LinkedList2();
		Scanner sc = new Scanner(System.in);
		int data = 0;
		System.out.println("inserted");
		
		do {
			switch (menu = SelectMenu()) {
			case Add: // 머리노드 삽입
				String no = sc.nextLine();
				String name = sc.nextLine();
				lo.length++;
				l.Add(no, name);
				break;
			case Delete: // 머리 노드 삭제
				int num = sc.nextInt();
				if (LinkedList2.Delete(num) == true)
					System.out.println("삭제된 데이터는 " + num);
				else
					System.out.println("데이터 없음");
				break;
			case Show: // 꼬리 노드 삭제
				l.Show();
				break;
			case Search: // 회원 번호 검색
				int n = sc.nextInt();
				if (LinkedList2.Search(n) == false)
					System.out.println("검색 값 = " + n + "데이터가 없습니다.");
				else
					System.out.println("검색 값 = " + n + "데이터가 존재합니다.");
				break;
			case Exit: // 꼬리 노드 삭제
				break;
			}
		} while (menu != Menu.Exit);
	}

}
