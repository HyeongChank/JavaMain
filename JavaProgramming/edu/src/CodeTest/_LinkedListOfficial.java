package CodeTest;
// 연결 리스트 클래스

import java.util.Scanner;


class Node3 {
    private int data;            
    private Node3 next;        //다음노드

    Node3(int data, Node3 next) {
        this.data = data;
        this.next = next;
    }

	public Node3 getNext() {
		return next;
	}

	public void setNext(Node3 next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
    
}
public class _LinkedListOfficial {

	public static void main(String args[]) {

		Scanner kb = new Scanner(System.in);
		while(true){
			System.out.println("아래 메뉴 중 선택");
			System.out.println("1.추가 2.삭제 3.검색 4.print 5.맨 앞에 추가");
			int ch = kb.nextInt();
			switch(ch) {
				case 1 :
					System.out.println("추가할 data");
					int no = kb.nextInt();
					addFirst(no);
					break;
					
				case 2 : 
					System.out.println("삭제");
					delete();
					break;
					
				case 3 :
					System.out.println("검색할 data");
					int noS = kb.nextInt();
					search(noS);
					break;

				case 4 :
					System.out.println("출력");
					print();
					break;
					
				case 5 :
					System.out.println("맨 앞에 추가");
					int nof = kb.nextInt();
					addFinal(nof);
					break;
			}
		}			
	}
 	static Node3 head;
 	static Node3 tail;
 	
	public static void addFirst(int k) {
		Node3 n = head;      // 삽입 전의 머리 노드
		// n에서 여태까지 축적된 head를 받고 이를 다시 head의 next에 그대로 넣음으로써 node 연결
		head = new Node3(k, n);
		
	}
	public static void addFinal(int k) {
		Node3 f = head;
		while(true) {
			if(f.getNext() != null) {
				f = f.getNext();
			}
			else {
				f = f.getNext();
				head = new Node3(k,f);
				break;
				
			}
		}
	}

	
	public static void search(int k) {
		Node3 sp = head;
		while(sp != null) {
			
			if(sp.getData() == k) {
				System.out.println(k + "는 저장되어 있습니다.");
				break;
			}
			else {
				sp = sp.getNext();
				if(sp==null) {
					System.out.println("no information");		
				}
			}
		}
	}
	public static void delete() {
		if(head != null) {
			head = head.getNext();
		}
	}
	public static void print() {
		Node3 np = head;
		while (np != null) {
			System.out.print(np.getData());
			System.out.print("  ");
			np = np.getNext();
		}
		System.out.println();
	}

}