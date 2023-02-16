package com.ruby.java.ch14.Interface;



interface Multiply{
	double getValue();
}

public class Test02_Ramda {

	public static void main(String[] args) {
		Multiply m;
		m = () -> 3.14*2;
		System.out.println(m.getValue());

	}

}
