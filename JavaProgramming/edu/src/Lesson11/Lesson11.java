package Lesson11;

import java.io.*;

public class Lesson11 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\eclipse\\eclipse-workspace\\JavaStudy2\\test1.txt");
		FileWriter wf = new FileWriter(file, true);
		String str = "자바 파일쓰기\n";
		String str2 = "자바 덮어쓰기\n";
		wf.write(str);
		wf.write(str2);
		wf.close();
		

	}

}
