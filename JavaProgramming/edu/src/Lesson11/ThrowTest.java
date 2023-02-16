package Lesson11;

public class ThrowTest {

	public static void calc() throws ArithmeticException {
		int num = 10/0;

	}
	public static void main(String[] args) {
		try {
			ThrowTest.calc();
			
		}
		catch(Exception e) {
			System.out.println("예외처리문 실행");
		}
	}

}
