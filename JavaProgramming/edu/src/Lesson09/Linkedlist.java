package Lesson09;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.add("node1");
		linkedlist.add("node3");
		linkedlist.add("node7");
		linkedlist.add("node5");
		System.out.println(linkedlist);
		
		linkedlist.addFirst("node0");
		linkedlist.addLast("node8");
		System.out.println(linkedlist);
		linkedlist.removeFirst();
		linkedlist.add(1,"node4");
		System.out.println(linkedlist);
		linkedlist.remove(3);
		System.out.println(linkedlist);
	}

}
