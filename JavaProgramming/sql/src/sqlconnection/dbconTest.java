package sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Scanner;



public class dbconTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}
		catch(Exception e) {
			System.out.println("로딩");
			e.printStackTrace();
			return;
		}
		Connection conn =null;
		PreparedStatement psmt =null;
		PreparedStatement psmt2 =null;
		PreparedStatement psmt3 =null;
		PreparedStatement psmt4 =null;
		ResultSet rs = null;
		int result =0;
		
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pnusw46","root","1234");

//		select
//			psmt = conn.prepareStatement("select * from book");
//			psmt2 = conn.prepareStatement("select * from customer");
//			rs = psmt2.executeQuery();
//			while(rs.next()) {
//			String a1 = rs.getString("name");
//			String a2 = rs.getString("address");
//			System.out.println(a1 + " " + a2);
//		}			
//
//		insert		
//			String query = "insert into book(bookid, bookname, publisher, price) values("
//						+ " ?,?,?,?)";
//			psmt3 = conn.prepareStatement(query);
//			psmt3.setInt(1, 40);
//			psmt3.setString(2, "갈라파");
//			psmt3.setString(3, "good");
//			psmt3.setInt(4, 3000);
//			
//			result = psmt3.executeUpdate();
			
//		create table	
//			String query2 = "create table user(id varchar(20) primary key, name varchar(20), email varchar(20))";
//			psmt4 = conn.prepareStatement(query2);
//			result = psmt4.executeUpdate();

//		insert
//			String query = "insert into user values("
//						+ " ?,?,?)";
//			psmt3 = conn.prepareStatement(query);
//			psmt3.setString(1, "jsk");
//			psmt3.setString(2, "GP");
//			psmt3.setString(3, "good@naver.com");
//			result = psmt3.executeUpdate();
//			System.out.println("완료");
			
			
			Scanner kb = new Scanner(System.in);
			while(true) {
				System.out.println("아래 항목 중 선택하시오");
				System.out.println("1.insert 2.select 3.research table 4.delete");
				int a = kb.nextInt();
	
				
				switch(a) {
				case 1 : 
					System.out.println("테이블을 입력하시오");
					System.out.println("table : ");
					String e = kb.next();
					String query = "insert into " + e +" values("
						+ " ?,?,?,?)";
					psmt3 = conn.prepareStatement(query);
					System.out.println("insert할 정보를 입력하시오");
					System.out.println("uid : ");
					String id = kb.next();
					System.out.println("uname : ");
					String name = kb.next();
					System.out.println("email : ");
					String email = kb.next();
					System.out.println("rdate : ");
					String date = kb.next();
					
					psmt3.setString(1, id);
					psmt3.setString(2, name);
					psmt3.setString(3, email);
					psmt3.setString(4, date);
					result = psmt3.executeUpdate();
					System.out.println("insert 완료");
					break;
				
				case 2 :
					System.out.println("테이블을 입력하시오");
					System.out.println("table : ");
					String q = kb.next();
					System.out.println("select할 속성을 입력하시오");
					
					System.out.println("column : ");
					String w = kb.next();
					System.out.println("where 조건을 입력하시오");
					System.out.println("where 조건문 : ");
					String r = kb.next();
					String query3 = "select " + w + " from " + q + " where " + r + ";";
					psmt3 = conn.prepareStatement(query3);
					System.out.println(query3);
					rs = psmt3.executeQuery();
					
					
					String [] str = w.split(",");
					for(String er : str) {
						System.out.println("str split " + er);
					}
					String full= "";
					int key =0;
					
					
					while(rs.next()) {
						
						String trt = rs.getString(str[0]);
						String trt2 = rs.getString(str[1]);
						System.out.println(trt + " " + trt2 + "          yeah");
						System.out.println(rs.getString(str[0]) + " " + rs.getString(str[1]) + "             yeah2");						
	//				속성 개수만큼 출력하는 거 만들어야 함	
					}
					System.out.println("Rmxdmsdlrsk");
	//				System.out.println("name" + rs.getString("name"));
	//				for(int i =0; i< str.length; i++) {
	//					full += rs.getString("'" + str[i] + "'");
	//					
	//					System.out.println(full);
	//				}
					break;
				case 3 : 
					System.out.println("테이블을 입력하시오");
					System.out.println("table : ");
					String g = kb.next();
					String query2 = "select * from " + g;
					psmt3 = conn.prepareStatement(query2);
					rs = psmt3.executeQuery();
					while(rs.next()) {
						String a1 = rs.getString("uid");
						String a2 = rs.getString("uname");
						String a3 = rs.getString("email");
						String a4 = rs.getString("rdate");
						System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);
					}
					System.out.println("show 완료");
					break;
					
				case 4:
					System.out.println("테이블을 입력하시오");
					System.out.println("table : ");
					String del = kb.next();
					System.out.println("where 조건문을 입력하시오");
					String whe = kb.next();
					String query4 = "delete from " + del + " where " + whe + ";";
					psmt3 = conn.prepareStatement(query4);
					result = psmt3.executeUpdate();
					
					System.out.println("delete 완료");
					break;
				}
				
				
					
			}	
		}
		
		
		
		
		catch(SQLException e) {
			System.out.println("DB 연결 오류");
		}
		finally {
//			psmt.close();
			conn.close();
		}
	}

}
