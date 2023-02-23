package DataStructure_Queen;
import java.awt.Point;

public class Queen8Help {
    private static final int BOARD_SIZE = 8;
    private static final int QUEEN_COUNT = 8;
    private static Point[] queens = new Point[QUEEN_COUNT];

    public static void main(String[] args) {
        solveQueensProblem();
    }

    private static void solveQueensProblem() {
        placeQueens(0);
        printQueens();
    }

    private static void placeQueens(int row) {
        if (row == QUEEN_COUNT) {
            return;
        }
        for (int column = 0; column < BOARD_SIZE; column++) {
            Point queen = new Point(row, column);
            queens[row] = queen;
            if (isQueenSafe(queen)) {
                placeQueens(row + 1);
            }
        }
        queens[row] = null;
    }

    private static boolean isQueenSafe(Point queen) {
        for (int i = 0; i < QUEEN_COUNT; i++) {
            Point otherQueen = queens[i];
            if (otherQueen == null || otherQueen == queen) {
                continue;
            }
            if (queen.x == otherQueen.x || queen.y == otherQueen.y
                    || Math.abs(queen.x - otherQueen.x) == Math.abs(queen.y - otherQueen.y)) {
                return false;
            }
        }
        return true;
    }

    private static void printQueens() {
        for (int i = 0; i < QUEEN_COUNT; i++) {
            Point queen = queens[i];
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (queen != null && queen.x == i && queen.y == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
