package CodeTest;
// 연결 리스트 클래스

import java.util.Comparator;


class Node3 {
    private int data;              // 데이터
    private Node3 next;        // 뒤쪽 포인터(다음 노드에 대한 참조)

    //--- 생성자(constructor) ---//
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
		addFirst(1);
		addFirst(2);
		addFirst(3);
		print();
		delete();
		print();
		addFinal(5);
		addFinal(5);
		print();
	}
 	static Node3 head;
 	static Node3 pick;
 	static Node3 tail;
	public static void addFirst(int k) {
		Node3 n = head; // 삽입 전의 머리 노드
		head = new Node3(k, n);
	}
	public static void addFinal(int k) {
		Node3 f = head;

		if(head ==null) {
			addFirst(k);
		}
		else {
			while(f.getNext() != null) {
				f = f.getNext();
			}
			f = f.getNext();
			f = new Node3(k,null);
			System.out.println(f.getData());
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
			np = np.getNext();
		}
		System.out.println();
	}

}