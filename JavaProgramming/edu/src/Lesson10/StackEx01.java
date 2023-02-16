package Lesson10;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(50);
		stack.push(40);
		
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.empty());
		System.out.println(stack.contains(30));
		System.out.println(stack.search(30));
		System.out.println(stack.peek());
	}

}
