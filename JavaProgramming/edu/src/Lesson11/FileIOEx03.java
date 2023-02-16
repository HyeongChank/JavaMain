package Lesson11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileIOEx03 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\eclipse\\eclipse-workspace\\JavaStudy2\\sales.txt");
		Scanner salesFile = new Scanner(file);
		while(salesFile.hasNext()) {
			int sales = salesFile.nextInt();
			System.out.println(sales);
		}
		salesFile.close();
	}

}
