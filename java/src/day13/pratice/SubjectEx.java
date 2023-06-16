package day13.pratice;

public class SubjectEx {

	public static void main(String[] args) {
		// 성적을 관리하기 위한 Subject클래스를 만드세요.
		
		Subject sub1 = new Subject("kor");
		sub1.print();
		
		System.out.println("============");
		
		Subject sub2 = new Subject("eng", 1, 1);
		sub2.updateScore(30, 40, 10);
		sub2.print();
	}

}
