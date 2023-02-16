package Lesson11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException{
		int ch;
		FileReader fr = new FileReader("C:\\eclipse\\eclipse-workspace\\JavaStudy2\\sales.txt");
		FileWriter fw = new FileWriter("C:\\eclipse\\eclipse-workspace\\JavaStudy2\\sales2.txt");
		while((ch = fr.read()) != -1) {       //괄호 (( )) 주의하기
			fw.write(ch);
		}
		System.out.println("파일을 복사함");
		fr.close();
		fw.close();
	}

}
