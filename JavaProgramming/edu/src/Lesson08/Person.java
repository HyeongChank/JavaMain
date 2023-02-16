package Lesson08;

public class Person {
	private String name;
	private String phone;
	private int number;
	Person(){}
	
	
	Person(String name, String phone, int number){
		this.name = name;
		this.phone = phone;
		
	}
	public String toString() {
		return name + " : " + phone + " : "+ number;
	}
	public int deString() {
		return number;
	}
	

	void eat() {
		System.out.println("먹는다");
		
	}
	void sleep() {
		System.out.println("잠잔다");
	}
	void displayPerson() {
		System.out.println(name);
		System.out.println(phone);
	}
}
