package DataStructure_Queen;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Stack;
public class Queen8 {
	
	
//int top;
//Point [] data
//void Push(Point p);
//Point Pop();
// }
// void NextMove(int[] move, int row); // current row에 대한 다음 배치 가능한 모든 column을 조사하고 move[]에 1로 설정
// boolean CheckMove(int currentRow, int row, int col) //currentRow에 대하여 queen을 (x,y)에 배치 가능하면 true
//
//=> backtracking을 stack을 이용하여 push/pop으로 해결하는 것을 보이는 것임
//
//-> 가로, 세로, 대각선에 대한 충돌 체크 함수 코딩
//boolean CheckMove(x,y) {
//	
//	static boolean checkcol(int x, int y) {
//		if (y == index - 1 || y == index || y == index + 1) {
//			return false;
//		} else {
//			return true;
//		}
//	}
//checkRow(x);
//checkCol(y);
//checkDiagSW(x,y); //x++, y-- or x--, y++ where 0<= x,y <= 7
//checkDiagSE(x,y); //x++, y++ or x--, y--
//}


	
	
	
	
	
	
	
	
	
	
	
	

//	static int index = -2;
//	static int [] position = new int[4];
//	static ArrayList<Integer> list = new ArrayList<Integer>();
//	int x = 0;
//	int y =0;
//
//	
//		static int columngo(int x, int y) {
//		if(checkcol(x,y) == true) {
//			rowgo(x,y);
//		}
//		if(checkcol(x,y) == false) {
//			position[y]=0;
//			++y;
//			columngo(x,y);
//		}
//		if(y==4) {
//			rowgo(x-1,0);
//		}
//		return y;
//	}
//	
//	static int rowgo(int x, int y) {
//		
//		if(checkcol(x, y) == true) {
//			while(true) {
//				int k=0;
//				position[k] = 0;
//				k++;
//				if(k==position.length) {
//					break;
//				}
//			}
//			position[y] = 1;
//			for(int i : position) {
//				System.out.print(i);
//			}
//			System.out.println();
//			++x;
//			index = y;
//			y=0;
//			columngo(x,y);
//		}
//		if(checkcol(x,y) == false) {
//			checkcol(x-1, 0);
//		}
//		return x;
//	}


	
	
	
	
	
	
	static int num=0;
	
	static int [] p = new int[4];
	static Stack<Integer> stack = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	static Stack<Integer> stackx = new Stack<Integer>();
	static int [] check = {0,0,0,0};
	static int count =0;
	
	static int [] push(int [] p) {
	
		
		int index =100;
		while(true) {
			if(num==4) break;
			for(int i=0;i<p.length-count; i++) {
				if(!stack.contains(1) && i !=index && i != index-1 && i !=index+1 && !stack2.contains(i) ) {
					stack.push(1);
					p[i] = 1;
					index = i;
					stack2.push(index);
					check[i] = index;
					num++;
			}
				else {
					stack.push(0);
					p[i] = 0;
					num++;
				}
			}
		}	
		System.out.println(stack);
		pop(stack);
	
		return p ;
	}
	static void pop(Stack<Integer> s) {
		s.pop();
		s.pop();
		s.pop();
		s.pop();
	}
	
	public static void main(String[] args) {
		int [] result = new int[4];
		
		int sum =0;
		
		result = push(p);
				
		for(int i=0; i< result.length; i++) {
			sum +=result[i];
		}
	
		System.out.println(sum);
//		int start = result[0];
//		if(sum !=6) {
//			stack2.pop();
//			stack2.pop();
//			stack2.pop();
//			stack2.pop();
//			count ++;
//			for(int i=0; i<count;i++) {
//				stack.push(0);
//			}
//			push();
//		}
	

		
		
		
		
		
		
		
		
		
		
		
	}
}
