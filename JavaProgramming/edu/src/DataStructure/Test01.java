package DataStructure;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test01 {

	public static void main(String[] args) {
		try {

		      // 파일 읽어스 string 객체를 정렬하는 프로그램 구성
		      Path input = Paths.get("a.txt");

		      byte[] bytes = Files.readAllBytes(input);
//		      System.out.println("== readAllBytes ==");
		      System.out.println(new String(bytes));
		      // ------------------- 추가한 코드
		      // file 입출력 + String 처리 + 정렬 코딩
		      String s = new String(bytes);
//		      System.out.println("s = " + s);
		      String [] sa = s.split(" |\n");

		      
		      String str = sa.toString();
//		      System.out.println(str);
//		     System.out.println(sa[0]);
//		     System.out.println(sa[]);
//		     
		     
//		      System.out.println(str2.charAt(0));
		      
		      String temp = " ";
		      String str3;
		      for(int i =0; i<sa.length; i++) {
		    	  for(int j =i+1 ; j<sa.length; j++) {
		    		  if(sa[i].compareTo(sa[j]) > 0){
		    			  temp = sa[i];
		    			  sa[i] = sa[j];
		    			  sa[j] = temp;
		    			  
		    		  }
		    		 
		    	  }
		    	  System.out.println(sa[i]);
		    	  
		      }
		      String str2 = "abewecde";
//		      int temp2 = 0;
//		      int index =0;
//		      int max =0 ;
//		      for(int i =0 ; i<str2.length(); i++) {
//		    	  for(int j =i ; j<str2.length(); j++) {
//		    		  int num = str2.charAt(j);
//		    		  
//		    		  if(num > max) {
//		    			  max = str2.charAt(j);
//		    			  str2.charAt(i) = max;
//						}	
//	    		  }
//	    		  temp2 = str2.charAt(i);
//	    		  str2.charAt(i) = 
//		    		  
//	    	  }
		   
		      // ---------------------------

		      int bufferSize = 10240;
		      String b = " ";
		      ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
		      for (String sx : sa) {
//		    	  System.out.println(" " + sx);
		    	  buffer.put(sx.getBytes());
		    	  buffer.put(b.getBytes());
		      }
			  buffer.flip();
		      FileOutputStream file = new FileOutputStream("c.txt");
		      FileChannel channel = file.getChannel();
		      channel.write(buffer);
		      file.close();


		    } catch(IOException e) {
		      e.printStackTrace();
		    }
		  }
		}