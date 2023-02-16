package com.ruby.java.ch14.Interface;

interface MyInterface {
	public void print();
}

//인터페이스 구현 방법
class MyClass1 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass1");
	}
}

class MyClass2 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass2");
	}
}

public class Test01 {
	public static void test(MyInterface mi) {
		mi.print();
	}

	public static MyInterface test2() {
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("test2()매서드에서 반환된 Myinterface");
			}
		};
		return mi;
	}

	public static void main(String[] args) {
		// 익명클래스를 참조하는 참조변수 방법
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();

		mc1.print(); // MyClass1
		mc2.print(); // MyClass2
		test(mc1);

		MyInterface mi = new MyInterface() {
			@Override // new를 쓰면 익명클래스
			public void print() {
				System.out.println("익명클래스");
			}

		};
		test(mc1); // MyClass1
		test(mi); // 익명클래스

		mi.print(); // 익명클래스

//		인터페이스 구현과 동시에 객체가 생성되고 메서드 호출이 실행되는 방법
		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("선언, 생성, 호출 한번에 처리");
				System.out.println();
			}
		}).print(); // "선언, 생성, 호출 한번에 처리"

		MyInterface mi2 = test2();
		mi2.print(); // test2() 매서드에서 반환된 Myinterface
		MyInterface m = () -> System.out.println("익명이다");
		m.print();
	}
}