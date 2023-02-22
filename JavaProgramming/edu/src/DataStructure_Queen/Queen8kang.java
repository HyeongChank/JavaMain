package DataStructure_Queen;


class Point{
	private int x;
	private int y;
	public Point(int a, int b) {
		this.x = a;
		this.y = b;
		
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
	public void push(Point po) {
		p[top++] = po;
		
	}
	public Point pop() {
		return p[--top];
	}
}




public class Queen8kang {
//	문제 해결형 자바 코딩 실습이 필요
	//- main()의 작성 방법 훈련 -
	public static boolean checkRow(int x, int [][] pow) {
		for(int i=0; i<4; i++) {
			if(pow[x][i] ==1) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkCol(int y, int [][] pow) {
		for(int i=0; i<4; i++) {
			if(pow[i][y] ==1) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkDiagSW(int x, int y, int [][] pow) {
		int sx = x;
		int sy = y;
				
		int row =4;
		int column =4;
		while(x>0 && x<row && y>0 && y<column) {
			if(pow[x][y] != 1) {
				x++;
				y--;
			}
			if(pow[x][y] == 1) {
				return false;
			}
		}
		sx = x;
		sy = y;
		while(x>0 && x<row && y>0 && y<column) {
			if(pow[x][y] != 1) {
				x--;
				y++;
				
			}
			if(pow[x][y] == 1) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkDiagSE(int x, int y, int [][] pow) {
		int sx = x;
		int sy = y;
				
		int row =4;
		int column =4;
		while(x>0 && x<row && y>0 && y<column) {
			if(pow[x][y] != 1) {
				x++;
				y++;
			}
			if(pow[x][y] == 1) {
				return false;
			}
		}
		sx = x;
		sy = y;
		while(x>0 && x<row && y>0 && y<column) {
			if(pow[x][y] != 1) {
				x--;
				y--;
				
			}
			if(pow[x][y] == 1) {
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean checkmove(int x, int y, int [][] data ) {
		
		checkRow(x, data);
		checkCol(y,data);
		checkDiagSW(x,y, data); //x++, y-- or x--, y++ where 0<= x,y <= 7
		checkDiagSE(x,y, data); //x++, y++ or x--, y--
		return false;
	}
	
	
	static void SolveQueen(int [][]data) {
		Point pow = new Point(0,0);
		MyStack ms = new MyStack();
		ms.push(pow);
		Point pow2 = ms.pop();
		int x = pow2.getX();
		int y = pow2.getY();
		while(x<4) {
			while(y<4) {
				y++;
				checkmove(x,y, data);
			}
			x++;
		}
	}
	
	
	
	public static void main(String []args) {
		int [][] data = new int[4][4];
		
		for(int i=0;i<4;i++) {
			for(int j =0; j<4;j++) {
				data[i][j] =0;
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
		SolveQueen(data);
		
		
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


