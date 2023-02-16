package edu;

public class Test36 {

	public static void main(String[] args) {
		char letter = 'A';
		char[] alphabet = new char[226];

		for (int i = 0; i < alphabet.length; i+=2) {
			alphabet[i] = (char) (letter + i);

		}
		for (char c : alphabet) {
			System.out.print(" " + c);
	
		}

	}

}

