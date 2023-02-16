package Lesson08;

public class Circle {
	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
		double a = Math.PI*r*r;
		System.out.println("반지름 : ");
		System.out.println("원의 넓이는 : " + a);
	}
	

		
	
}
