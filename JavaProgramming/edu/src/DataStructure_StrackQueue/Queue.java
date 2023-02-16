package DataStructure_StrackQueue;

import java.util.LinkedList;
import java.util.Scanner;

import DataStructure_StrackQueue.IntQueue.EmptyIntQueueException;
import DataStructure_StrackQueue.IntQueue.OverflowIntQueueException;

public class Queue {

	static int[] data = new int[4]; // 큐용 배열
	static int capacity = 4; // 큐의 크기
	static int front = 0; // 맨 처음 요소 커서
	static int rear = 0; // 맨 끝 요소 커서
	static int num = 0; // 현재 데이터 개수

	static int add(int x) throws OverflowIntQueueException {
		if (num < capacity) {
			data[rear] = x;
			rear++;
			num++;
			for (int i : data) {
				System.out.print(i);
			}
			System.out.println();
		}
		else if ((rear) % capacity == front) {
			for (int i = 0; i < data.length - 1; i++) {
				data[i] = data[i + 1];
			}
			data[data.length - 1] = x;
			for (int i : data) {
				System.out.print(i);
			}
			System.out.println();
		}
		return x;
	}
	static int delete() throws EmptyIntQueueException {
		if (num > 0) {
			for (int i = 0; i < data.length - 1; i++) {
				data[i] = data[i + 1];
				num--;
				rear--;
			}
			data[data.length - 1] = 0;
			for (int i : data) {
				System.out.print(i);
			}
			System.out.println();
		}
		return num;
	}

	static int viewall() {
		for (int i : data) {
			System.out.print("\t" + i);
		}
		System.out.println();
		return data[0];
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while (true) {
			System.out.println("1.추가" + " 2.삭제" + " 3.모든 정보 출력");
			System.out.println();
			switch (kb.nextInt()) {
			case 1:
				System.out.println("추가할 데이터를 입력하시오");
				add(kb.nextInt());
				break;
			case 2:
				delete();
				break;
			case 3:
				viewall();
				break;
			}
		}
	
		
		// 한 클래스에 모두 포함
//		int capacity =4;
//		int front =0;
//		int rear =0;
//		LinkedList<Integer> que = new LinkedList<Integer>();
//		Scanner kb = new Scanner(System.in);
//		
//		
//		while(true) {
//			System.out.println("1.추가" + " 2.삭제" + " 3.전체삭제 ");
//			switch(kb.nextInt()) {
//			case 1 : 
//				if(front !=capacity) {
//					System.out.println("작성");
//					que.offer(kb.nextInt());
//					front++;
//	
//				System.out.println(que);
//				break;
//				}
//				if(front == capacity) {
//					System.out.println("가득차서 처음꺼지움");
//					que.poll();
//					front--;
//					break;
//				}
//			case 2 : if(front ==rear) {
//				System.out.println("없음");
//				}
//				else {que.poll();
//				}
//				--front;
//				System.out.println(que);
//				break;
//			
//			case 3 : while(!que.isEmpty()) {
//				que.poll();
//				}
//				front =0;
//				System.out.println(que);
//				break;
//			}
//		}
	}
}
