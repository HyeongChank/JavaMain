package Lesson08;

public class MainClass {

	public static void main(String[] args) {
		Student s = new Student("Tom","010-1232-1234",10,"2020");
		s.eat();
		s.sleep();
		s.study();
		s.displayStudent();
		
		System.out.println(s.toString());
		System.out.println(s.deString());		
          // 왜 int number 가 0으로 출력되는지 모르겠음.
	}

}
