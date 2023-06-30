package day22.practice.phone.run;

import day22.practice.phone.controller.PhoneManager;

public class PhoneListEx {
	/*
	1. 전화번호 등록
	2. 전화번호 수정
	3. 전화번호 검색
	4. 프로그램 종료 
	 */
	public static void main(String[] args) {
		/*
		PhoneBook pb = new PhoneBook();		
		System.out.println(pb.insertPhone("Hong", "010-1234-5678"));
		System.out.println(pb.insertPhone("Lim", "010-123-567"));
		pb.print(p->true);
		System.out.println(pb.updateName("Hong", "Hong gil"));
		pb.print(p->true);
		System.out.println(pb.updateNumber("Hong gil", "010-1111-2222"));
		pb.print(p->true);
		System.out.println(pb.update("Hong gil", "Lim", "010-1111-3333"));
		pb.print(p->true);
		System.out.println(pb.delete("Lim"));
		pb.print(p->true);
		*/
		
		PhoneManager pm = new PhoneManager();
		pm.run();
	}

}
