package Lesson11;

public class ExceptionTest01 {

	public static void main(String[] args) {
		try {
			String name = "홍길동";
			int nume = Integer.parseInt(name);
		}
		catch(Exception e){
			System.out.println("오류메시지 : " +e);
		}

	}

}
