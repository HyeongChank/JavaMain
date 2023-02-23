package CodeTest;

class Point{
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
		p = new Point[15];
	
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
public class MazeExit {
	static int x=1;
	static int y=1;
	static MyStack ms = new MyStack();
	static int [][] input = {
			
			{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
			{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
			{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
			{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
			{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 },
			{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 },
			};		
	
	static boolean checkMove(int z, int k) {
		if(!checkE(z,k)) return false;
		if(!checkSE(z,k)) return false;
		if(!checkN(z,k)) return false;
		if(!checkNE(z,k)) return false;
		if(!checkS(z,k)) return false;
		if(!checkSW(z,k)) return false;
		if(!checkW(z,k)) return false;
		return true;
	}	

	private static boolean checkW(int z, int k) {
		k--;
		if(input[z][k] ==1) {
			return false;
		}
		else {
			input[x][y]=1;
			return true;
		}
		
	}
	private static boolean checkSW(int z, int k) {
		++z;
		--k;
		if(input[z][k] ==1) {
			return false;
		}
		else {
			input[x][y]=1;
			return true;
		}
	}
	private static boolean checkS(int z, int k) {
		++z;
		if(input[z][k] ==1) {
			return false;
		}
		else {
			input[x][y]=1;
			ms.push(new Point(x,y));
			
			return true;
		}
	}
	private static boolean checkSE(int z, int k) {
		++z;
		++k;
		if(input[z][k] ==1) {
			return false;
		}
		else {
			input[x][y]=1;
			ms.push(new Point(x,y));
			x++;
			y++;
			return true;
		}
		
		
	}
	private static boolean checkE(int z, int k) {
		++k;
		if(input[z][k] ==1) {
			return false;
		}
		else {
			input[x][y]=1;
			y++;
			return true;
		}
	}
	private static boolean checkNE(int z, int k) {
		--z;
		++k;
		if(input[z][k] ==1) {
			return false;
		}
		else {
			input[x][y]=1;
			return true;
		}
	}
	private static boolean checkN(int z, int k) {
		--z;
		if(input[z][k] ==1) {
			return false;
		}
		else {
			input[x][y]=1;
			return true;
		}
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Point p = new Point(x,y);
		x = p.getX();
		y = p.getY();
		Point popq ;
		while(true) {		
			while(true) {
				if(checkMove(x,y)==true) {
						
					break;
					}
				if(checkMove(x,y) ==false) {
					popq = ms.pop();
					x = popq.getX();
					y = popq.getY();
					input[x][y] =1;
					
				}
			}
		}
//		for(int i=0;i<input.length;i++) {
//			for(int j=0; j<input[0].length;j++) {
//				System.out.print(input[i][j] + " ");
//			}
//			System.out.println();
//		}
		

	}
}

