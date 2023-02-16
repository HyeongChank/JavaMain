package Lesson08;

public class Student extends Person {
	private String year;
	Student(){}
	Student(String name, String phone, int number, String year){
		super(name, phone, number);
		this.year = year;
		
	}
	void study() {
		System.out.println("공부한다");
	}
	void displayStudent() {
		displayPerson();
		System.out.println(year);
	}
	public String toString() {
		return super.toString() + year;
	}
}

