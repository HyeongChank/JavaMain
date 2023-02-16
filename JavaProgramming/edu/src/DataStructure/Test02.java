package DataStructure;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Test02 {


	public static void main(String[] args) {
		try {
			Path input = Paths.get("file1.txt");
			Path input2 = Paths.get("file2.txt");
			byte[] bytes = Files.readAllBytes(input);
			byte[] bytes2 = Files.readAllBytes(input2);
	  	    String s = new String(bytes);  // 배열을 문자열 s 로
	  	    String s2 = new String(bytes2);
//			System.out.println(s);
//			System.out.println(s2);
			// 문자열 split 해서 배열 만들기
			String [] spl = s.split(",");
			String [] spl2 = s2.split(",");
						                          //읽은 글자를 bytes 배열로 -> s 문자열로 -> 문자열을 띄어쓰기 구분으로 배열로
//			String[] sarray = new String[20];
//			String[] sarray2 = new String[20];
//			
			// 배열 ArrayList 로 변경 1
//			ArrayList<String> arrayList = new ArrayList<>();
//			for (String temp : spl) {
//				arrayList.add(temp);
//			}
//			ArrayList<String> arrayList2 = new ArrayList<>();
//			for (String temp : spl2) {
//				arrayList.add(temp);
//			}
//			System.out.println(arrayList);
//			System.out.println(arrayList2);
			
			// 배열 ArrayList 로 변경 2
			ArrayList<String> list1 = new ArrayList<>(Arrays.asList(spl));  //배열을 ArrayList 로
			ArrayList<String> list2 = new ArrayList<>(Arrays.asList(spl2));
			System.out.println("list1 = " + list1);
			System.out.println("list2 = " + list2);
		
			//중복값 제거하고 AL 합치기 방법 1(기존 AL과 겹치지 않는 값 합치기)
//			for(int i =0; i<list2.size(); i++) {
//				if(!list1.contains(list2.get(i))) {
//					list1.add(list2.get(i));
//				}
//			}
//			System.out.println(list1);
//			Collections.sort(list1);
			
			//배열 합치기 방법 2(새로운 AL에 하나씩 넣기)
//			ArrayList<String> join = new ArrayList<>();
//			for(int i =0; i<list1.size(); i++) {
//				if(!join.contains(list1.get(i))) {
//					join.add(list1.get(i));					
//				}
//			}
//			for(int i =0; i<list2.size(); i++) {
//				if(!join.contains(list2.get(i))){
//					join.add(list2.get(i));
//				}
//			}
//			System.out.println("list1 + list2 = " + join);
//			Collections.sort(join);
//			System.out.println("sort 결과 = " + join);
			

			
			ArrayList<String> list3 = new ArrayList<String>();

			Iterator<String> iter1 = list1.iterator();
			Iterator<String> iter2 = list2.iterator();
			String d1=null, d2=null, temp = null;
			int m = 0;
			while(iter1.hasNext() && iter2.hasNext()) {
//				System.out.println("m = " + m + ", temp = " + temp);
//				System.out.println("list3 = " + list3);
//				if (m == 0) {
//					d1 = iter1.next();
//					d2 = iter2.next();
//					System.out.println("d1 = " + d1);
//					System.out.println("d2 = " + d2);
//				}
//				if(d1.compareTo(d2) == 0) {
//					d1 = iter1.next();
//					list3.add(d1);
//				}
//				if(d1.compareTo(d2)<0) {
//					d2 = iter2.next();
//					list3.add(d2);
//				}
//				if(d1.compareTo(d2)>0) {
//					d1 = iter1.next();
//					list3.add(d1);
//				}
					
					
				if (temp != null) {
					if (d1.compareTo(temp) == 0) {
						d1 = iter1.next();
						continue;
					}
					else if (d2.compareTo(temp) == 0) {
						d2 = iter2.next();
						continue;
					}else {
						list3.add(temp);
					}
				}
				m = 1;
				}
				if (d1.compareTo(d2)< 0) {
					list3.add(d1);
					d1 = iter1.next();
				}
				if (d1.compareTo(d2) > 0) {
					list3.add(d2);
					d2 = iter2.next();
				}	
				else {
					temp = d1;
	
					m = 0;
				}
//		
//				
			
			while (iter1.hasNext()) {
				if (d1.compareTo(d2)> 0) {
					list3.add(d2);
					list3.add(d1);
					do {
						d1 = iter1.next();
						list3.add(d1);
					} while(iter1.hasNext());
				} else if (d1.compareTo(d2)< 0) {
					list3.add(d1);
					d1 = iter1.next();
					if (iter1.hasNext())
						continue;
					else
						if (d1.compareTo(d2)<= 0) {
							list3.add(d1);
							break;
						}
						else list3.add(d2);
				} {
					list3.add(d1);
					while (iter1.hasNext()) {
						d1 = iter1.next();
						list3.add(d1);
					}
					break;
				}
			}
			while (iter1.hasNext()) {
				//coding 필요 
			}
			
			
			/* 중복을 포함하여 merge하는 코드: 복잡하다. 비추
			String data1=null, data2 = null;
			int mode = 0;
			while (mode >= 0) {
				if (mode == 0) {
				data1 = iter1.next();
				data2 = iter2.next();
				System.out.println("data1 = " + data1);
				System.out.println("data2 = " + data2);
				}
				else if (mode == 1) {
					data1 = iter1.next();
					System.out.println("data1 = " + data1);
				}
				else
					data2 = iter2.next();
				System.out.println("data2 = " + data2);

				if ((data1.compareTo(data2)) <= 0) {

					list3.add(data1);
					if (iter1.hasNext())
					mode = 1;
					else {mode = -1;
					list3.add(data2);
					}
				

				} else if ((data1.compareTo(data2)) > 0) {
					list3.add(data2);
					if (iter2.hasNext())
					mode = 2;
					else {mode = -2;
					list3.add(data1);
					}
				} 
			}
			*/
			
			// binary search 구현
			// 방법1:
			//Arrays.binarySearch(null, null, null);// ArrayList에는 binarySearch()가 없다.
			// 방법2:
			// int result = Collections.binarySearch(list3, newFruit, cc);

			
			
			

			// iterator를 사용하여 merge한다
			String data1 = iter1.next();
			String data2 = iter2.next();
//			System.out.println(data1);
//			System.out.println(data2);
			
//			while(iter1.hasNext() && iter2.hasNext()) {
//				if(data1.compareTo(data2)<0) {
//					list3.add(data1);
//					data1 = iter1.next();
//				} else if(data1.compareTo(data2)>0){
//					list3.add(data2);
//					data2 = iter2.next();
//				} else {
//					list3.add(data1);
//					list3.add(data2);
//					data1 = iter1.next();
//					data2 = iter2.next();
//				}
//				
//			}
//			System.out.println(list3);
//			while(iter1.hasNext()) {
//				
//				
//			}
//			while(iter2.hasNext()) {
//			
//			}
			
//			while(iter1.hasNext()) {
//				list3.add(data1);
//			}
//			System.out.println(list3);
//			while(iter2.hasNext()) {
//				
//				if(!list3.contains(iter2.next())){
//					list3.add(data2);
//				}
//			}
//			System.out.println(list3);
			
			// ArrayList를 merge하는 코드 구현 list3 = list1 + list2(merge)

			// binary search 구현
			// 방법1:
			Arrays.binarySearch(null, null, null);// ArrayList에는 binarySearch()가 없다.
			// 방법2:
			// int result = Collections.binarySearch(list3, newFruit, cc);

			// 방법3:

			System.out.println();
			System.out.println("merge:: ");
			for (String city : list3)
				System.out.print(city + " ");
			// ArrayList를 배열로 전환
			String[] st = list3.toArray(new String[list3.size()]);
			// binary search 구현
			// binSearch(st, st.length, "key");
			// 정렬된 list3을 file에 출력하는 코드 완성
			int bufferSize = 10240;
			String b = " ";
			ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
			for (String sx : list3) {
				System.out.println(" " + sx);
				buffer.put(sx.getBytes());
				buffer.put(b.getBytes());
			}
			buffer.flip();
			FileOutputStream file = new FileOutputStream("c.txt");
			FileChannel channel = file.getChannel();
			channel.write(buffer);
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

