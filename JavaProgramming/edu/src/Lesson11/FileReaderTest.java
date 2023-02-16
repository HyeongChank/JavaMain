package Lesson11;

import java.io.*;

public class FileReaderTest {

	public static void main(String[] args) throws IOException{
		File file = new File("C:\\eclipse\\eclipse-workspace\\JavaStudy2\\test.txt");
		FileReader fr = new FileReader(file);
		int ch = 0;
		while((ch = fr.read()) != -1) {
			System.out.println((char)ch);
		}
		fr.close();
	}

}
