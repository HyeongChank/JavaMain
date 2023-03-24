package sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Scanner;



public class mission2 {

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

			Scanner kb = new Scanner(System.in);
			while(true) {
				System.out.println();
				System.out.println("아래 항목 중 선택하시오");
				System.out.println("1.insert 2.delete 3.research table 4.update");
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
				
				case 2:
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
					
				case 3 : 
					System.out.println("테이블을 입력하시오");
					System.out.println("table : ");
					String g = kb.next();
					System.out.println("조건 여부를 입력하시오(있으면 o 없으면 x 작성)");
					String whe3 = kb.next();
					if(whe3.equals("x")) {
						String query2 = "select * from " + g;
						psmt3 = conn.prepareStatement(query2);
						rs = psmt3.executeQuery();
						if(g.equals("user")) {
							while(rs.next()) {
								String a1 = rs.getString("uid");
								String a2 = rs.getString("uname");
								String a3 = rs.getString("email");
								String a4 = rs.getString("rdate");
								System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);
							}
							System.out.println("research 완료");
							break;
						}
						else if(g.equals("deluser")) {
							while(rs.next()) {
								String a1 = rs.getString("uid");
								String a2 = rs.getString("uname");
								String a3 = rs.getString("email");
								String a4 = rs.getString("wdate");
								System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);
							}
							System.out.println("research 완료");
							break;
						}
					}
					else {
						System.out.println("검색할 column개수 입력 : ");
						int num = kb.nextInt();
						String colresult = "";
						LinkedList<String> lk = new LinkedList<>();
						for(int i=0; i<num-1; i++) {
							System.out.println("검색할 column명 입력 : ");
							String col = kb.next();
							lk.add(col);
							colresult = colresult + col + ",";
						}
						System.out.println("검색할 column명 입력 : ");
						String lt = kb.next();
						colresult = colresult + lt;
						lk.add(lt);
						System.out.println(lk);
						System.out.println(colresult);
						
						String query2 = "select " + colresult + " from " + g + ";";
						psmt3 = conn.prepareStatement(query2);
						rs = psmt3.executeQuery();

						if(lk.contains("uid")&&lk.contains("uname")&&lk.contains("email")&&lk.contains("rdate")) {
							while(rs.next()) {
								String a1 = rs.getString("uid");
								String a2 = rs.getString("uname");
								String a3 = rs.getString("email");
								String a4 = rs.getString("rdate");
								System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);
							}
							System.out.println("research 완료");
							break;
						}
						else if(lk.contains("uid")&&lk.contains("uname")&&lk.contains("email")) {
							while(rs.next()) {
								String a1 = rs.getString("uid");
								String a2 = rs.getString("uname");
								String a3 = rs.getString("email");
								System.out.println(a1 + " " + a2 + " " + a3);
							}
							System.out.println("research 완료");
							break;
						}
						else if(lk.contains("uid")&&lk.contains("uname")) {
							while(rs.next()) {
								String a1 = rs.getString("uid");
								String a2 = rs.getString("uname");
								System.out.println(a1 + " " + a2);
							}
							System.out.println("research 완료");
							break;
						}
						else if(lk.contains("uid")) {
							while(rs.next()) {
								String a1 = rs.getString("uid");
								System.out.println(a1);
							}
							System.out.println("research 완료");
							break;
						}
					}

				case 4 :
					System.out.println("테이블을 입력하시오");
					System.out.println("table : ");
					String ta = kb.next();
					System.out.println("변경사항 : ");
					String up = kb.next();
					System.out.println("조건 : ");
					String wh2 = kb.next();
					String query3 = "update " + ta + " set " + up + " where " + wh2;
					psmt3 = conn.prepareStatement(query3);
					result = psmt3.executeUpdate();
					System.out.println("update 완료");
					break;
					
				}
			}	
		}

		catch(SQLException e) {
			System.out.println("DB 연결 오류");
		}
		finally {
			conn.close();
		}
	}

}
