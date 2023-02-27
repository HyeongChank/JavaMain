package DataStructure_Queen;

	
	
class Point{
	private int x;
	private int y;

	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public String toString() {
		return "<" + x + "," + y + ">";
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}


class MyStack{
	private int top ;
	private Point [] p;
	public MyStack() {
		top =0;
		p = new Point[100];
	
	}
	public boolean isEmpty() {
		if(top ==0)
			return true;
		else
			return false;
	}
	public void push(Point po) {
		p[top++] = po;
		
	}
	public Point pop() {
		return p[--top];
	}

	
}




public class Queen8_final {
	private static int row = 8 ;
	private static int column = 8 ;
	private static int [][] data = new int[row][column] ;

	public static boolean checkmove(int x, int y) {
		
		if(!checkRow(x)) return false;
		if(!checkCol(y)) return false;
		if(!checkDiagSW(x,y)) return false; //x++, y-- or x--, y++ where 0<= x,y <= 7
		if(!checkDiagSE(x,y)) return false; //x++, y++ or x--, y--
			return true;
	}
	
	public static boolean checkRow(int x) {
		for(int i=0; i<row; i++) {
			if(data[x][i] ==1) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkCol(int y) {
		for(int i=0; i<column; i++) {
			if(data[i][y] ==1) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkDiagSW(int x, int y) {
		int sx = x;
		int sy = y;
				
		while(sx>=0 && sx<row && sy>=0 && sy<column) {
			if(data[sx][sy] == 1)
				return false;
			
			sx++;
			sy--;
		}
		sx = x;
		sy = y;
		while(sx>=0 && sx<row && sy>=0 && sy<column) {
			if(data[sx][sy] == 1)
				return false;
			
			sx--;
			sy++;
		}
		return true;
	}
	public static boolean checkDiagSE(int x, int y) {
		int sx = x;
		int sy = y;
		
		while(sx>=0 && sx<row && sy>=0 && sy<column) {
			if(data[sx][sy] == 1) 
				return false;
				
			
			sx++;
			sy++;
		}
		sx = x;
		sy = y;
		while(sx>=0 && sx<row && sy>=0 && sy<column) {
			if(data[sx][sy] == 1) 
				return false;
			
			sx--;
			sy--;
		}
		return true;
	}
	
	

	
	
	static void SolveQueen() {
		Point pow = new Point(0,0);
		MyStack ms = new MyStack();

		int x = pow.getX();
		int y = pow.getY();
		int flag=0;
		while(true) {
			while(x<row) {
				while(y<column) {
					if(checkmove(x,y)) {
						data[x][y] = 1;
						ms.push(new Point(x,y));
//						
						y=0;
						break;
					}
					y++;

				}
				x++;
				if(y>=column) {
					if(!ms.isEmpty()) {
						pow=ms.pop();
						x = pow.getX();
						y = pow.getY();
						data[x][y] =0;
						y++;
					}
					else {
						flag =1;
						break;
					}
				}
				
			}
			if(flag ==1) break;
//			
			print();
			
			pow= ms.pop();
			x = pow.getX();
			y = pow.getY();
			data[x][y]=0;
			y++;
		}
	}
	static int num =0;
	public static void print() {
		System.out.println(++num);
		for(int i=0; i<row; i++) {
			for(int j =0; j<column ; j++) {
				System.out.print(data[i][j]+ "   ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String []args) {
	
		SolveQueen();
	}
}	
	//  main() {
//	 	배열 초기화
//		SolveQueen(data);
//		배열열 출력: 8개의 queen 배치(여러가지 해를 구해 보여주기)
	//  }
	//- 함수 호출로 구현 훈련
//	    void SolveQueen(int [][]d) {
//	       //코딩 완성하기 
//	    }
	//  => 8  Queen 문제 풀기: 스택 사용하여 backtracking 코딩 실습
//	    -> 2차원 배열에 0으로 초기화, Queen을 배치하면 1로 설정, 8 X 8 배열에 8개 퀸이 가로 세로 대각선에 충돌이 없으면 성공
	//
//	    -> stack에 Point 객체를 생성하여 push, pop::(x, y, move) => move는 다음 이동 가능 candidate의 column임
//	        class MyStack {
//	 	int top;
//		Point [] data
//		void Push(Point p);
//		Point Pop();
//	         }
//	         void NextMove(int[] move, int row); // current row에 대한 다음 배치 가능한 모든 column을 조사하고 move[]에 1로 설정
//	         boolean CheckMove(int currentRow, int row, int col) //currentRow에 대하여 queen을 (x,y)에 배치 가능하면 true
	//
//	        => backtracking을 stack을 이용하여 push/pop으로 해결하는 것을 보이는 것임
	//
//	    -> 가로, 세로, 대각선에 대한 충돌 체크 함수 코딩
//	     boolean CheckMove(x,y) {
//		checkRow(x);
//		checkCol(y);
//		checkDiagSW(x,y); //x++, y-- or x--, y++ where 0<= x,y <= 7
//		checkDiagSE(x,y); //x++, y++ or x--, y--
//	     }


