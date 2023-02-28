package DataStructure_Linkedlist;
import java.util.LinkedList;
public class LinkedList_DIM {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("검은");
		list.addFirst("흰");
		list.add("가");
		list.add("나");
		list.add("다");
		list.add("라");
		list.add("마");
		list.pollFirst();
		list.add(3, "3번째");
		list.remove(4);
		list.re
		System.out.println(list);

	}

}
