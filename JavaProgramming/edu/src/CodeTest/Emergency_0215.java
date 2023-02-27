package CodeTest;

public class Emergency_0215 {

	public static void main(String[] args) {
		int emergency[] = {3,76,24};
		int [] answer = new int[emergency.length];
		int max =0;
		for(int i =0 ; i< answer.length; i++) {
			for(int j =i ; j<emergency.length; j++) {
				if(emergency[j] > max) {
					emergency[j] = i+1;
				}
			}
			max=0;
		}
	}

}
