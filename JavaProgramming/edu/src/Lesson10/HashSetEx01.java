package Lesson10;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {       //클래스명(파일명)을 HashSet으로 하니까 오류남

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("f");
		hs.add("B");
		hs.add("c");
		hs.add("B");
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
