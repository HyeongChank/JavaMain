package Lesson09;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {
	Scanner scan = new Scanner(System.in);
	ArrayList<Member> members = new ArrayList<Member>();
	public void Run() {
		int sel = 0;
		while((sel = selectMenu()) != 0) {
			switch(sel) {
			case 1 : addMember(); break;
			case 2 : removeMember(); break;
			case 3 : searchMember(); break;
			case 4 : listMember(); break;
			default : System.out.println("잘못 선택함"); break;
			}
		}
		System.out.println("종료함");
	}
	int selectMenu() {
		System.out.println("1:추가 2:삭제 3:검색 4:목록 0:종료");
		int sel = scan.nextInt();
		scan.nextLine();
		return sel;
	}
	void addMember() {
		int num = 0;
		String name = "";
		System.out.println("추가할 회원번호 : ");
		num = scan.nextInt();
		scan.nextLine();
		System.out.println("추가할 회원이름 : ");
		name = scan.nextLine();
		Member member = new Member(num,name);
		members.add(member);
		System.out.println(member.toString() + "생성함");
		
	}
	void removeMember() {
		int num = 0;
		System.out.println("삭제할 회원 번호:");
		num = scan.nextInt();
		scan.nextLine();
		Member member = Find(num);
		if(member == null) {
			System.out.println("존재하지 않음");
			return;
		}
		members.remove(member);
		System.out.println(member.toString()+ "삭제함");
		
	}
	void searchMember() {
		int num = 0;
		System.out.println("검색할 회원번호:");
		num = scan.nextInt();
		scan.nextLine();
		Member member = Find(num);
		if(member == null) {
			System.out.println("존재하지 않음");
			return;
		}
		System.out.println("검색결과 : " + member.toString());
	}
	Member Find(int num) {
		for(Member member : members) {
			if(member.getNum() == num) {
				return member;
				
				
			}
		}
		return null;
		
		
	}
	void listMember() {
		System.out.println("전체목록");
		int cnt = members.size();
		System.out.println("회원수 : " + cnt);
		for(Member member : members) {
			System.out.println(member.toString());
		}
	}
}
