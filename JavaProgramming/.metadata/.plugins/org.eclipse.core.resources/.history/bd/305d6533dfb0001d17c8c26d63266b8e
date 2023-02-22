package DataStructure_Queen;

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
	static int index =-2;
	static boolean checkcol(int [] arr, int y) {
		if (y == index - 1 || y == index || y == index + 1 ) {
			return false;
		}

		else {
			return true;
		}
		
					
	}
	

	

	public static void main(String[] args) {
		int row=0; ;
		int column=0;
		int x=0;
		int y=0;
		int num=0;
		int [][] arr = new int[4][4];
		Stack<Integer> stack = new Stack<Integer>();
//		while(row<4) {
//			column=0;
//			while(column<4) {
//				if(checkcol(arr, y)==false) {
//					stack.push(0);
//					y++;
//					column++;
//				}
//				else if(y==3) {
//					stack.pop();
//					stack.pop();
//					stack.pop();
//					stack.pop();
//					y=0;
//				}
//				else{
//					stack.push(1);
//					index =y;
//					y=0;
//					row++;
//					column++;
//				}
//				
//			}
//			System.out.print(stack);
//		}
//
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = 0;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
