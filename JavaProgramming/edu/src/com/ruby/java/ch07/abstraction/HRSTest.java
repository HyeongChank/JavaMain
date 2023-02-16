package com.ruby.java.ch07.abstraction;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman �޿� = �⺻�� + �Ǹ� ����");
	}

	public void calcBonus() {
		System.out.println("Salesman ���ʽ� = �⺻�� * 12 * 4");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant �޿� = �⺻�� + ������ Ư�� ����");
	}

	public void calcBonus() {
		System.out.println("Consultant ���ʽ� = �⺻�� * 12 * 2");
	}
}

abstract class Manager extends Employee {          //매니저 클래스에는 calcBonus 매서드 바디 없어서 추상매서드 abstrack 넣음
	public void calcSalary() {
		System.out.println("Manager �޿� = �⺻�� + �� ���� ����");
	}
	
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director ���ʽ� = �⺻�� * 12 * 6");
	}
}

public class HRSTest {
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		s.calcSalary();
		c.calcSalary();
		d.calcSalary();
	}
}
