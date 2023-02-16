package DataStructure_Queen;

import java.util.ArrayList;

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
//checkRow(x);
//checkCol(y);
//checkDiagSW(x,y); //x++, y-- or x--, y++ where 0<= x,y <= 7
//checkDiagSE(x,y); //x++, y++ or x--, y--
//}

public class Queen8 {
    private static class Position {
        int row;
        int col;

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        int n = 8;
        int[] board = new int[n];
        Position[] stack = new Position[n];
        int top = -1;
        stack[++top] = new Position(0, 0);

        while (top >= 0) {
            Position pos = stack[top--];
            int row = pos.row;
            int col = pos.col;

            // 현재 위치에서 유효한 열을 찾아서 퀸을 놓음
            while (col < n) {
                if (isSafe(board, row, col)) {
                    board[row] = col;
                    if (row == n - 1) {
                        printBoard(board);
                    } else {
                        stack[++top] = new Position(row + 1, 0);
                    }
                    break;
                }
                col++;
            }
        }
    }

    private static boolean isSafe(int[] board, int row, int col) {
        // 현재 열에서 이전 행들과 같은 열에 있거나 대각선에 있는지 확인
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    private static void printBoard(int[] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
//	static int index = 0;
//	int row = 0;
//	int column = 0;
//
////		
////		
////		
////		
////		
//
//
////	
////	
//
//	static int checkcol(int x, int y) {
//		if (y == index - 1 || y == index || y == index + 1) {
//			return checkcol(x, y + 1);
//		} else {
//			return checkcol(x + 1, y);
//		}
//	}
//
//	static int checkrow(int x, int y) {
//		if(y)
//	}
////	
////	
////	
//
//	static int[][] array(int x, int y){
//		int [][] array = new int[x][y];
//		for(int i=0; i<x;i++) {
//			for(int j=0; j<y; j++) {
//				System.out.print(array[i][j]);
//			}
//			System.out.println();
//		}
//		return array;
//	}
//	public static void main(String[] args) {
//
//		array(8, 8);
//
//	}
//
//}
