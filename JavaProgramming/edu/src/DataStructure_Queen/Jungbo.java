package DataStructure_Queen;

public class Jungbo {

	public static void main(String[] args) {
		   int a = 5;

		   int s = 0;

		
		   switch(a/2){

		   case 2 : s++;

		   case 3 : a += s;

		   default : a++;

		   }

		
		   System.out.printf("%d %d", s, a);

		
		

	}

}
