package day8.homework;

import java.util.Scanner;

public class MethodScoreEx {

	public static void main(String[] args) {
		// 성적을 입력받아 학점을 출력하는 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("input month");
		
		int score = sc.nextInt();
		
		System.out.println(score + " is " + testScore(score));
		
		sc.close();
	}

	public static String testScore(int score) {
		String ch = null;
		if(score < 0 || score > 100) {
			ch = "wrong score";
		}else if(score >= 90) {
			ch = "A";
		}else if(score >= 80) {
			ch = "B";
		}else if(score >= 70) {
			ch = "C";
		}else if(score >= 60) {
			ch = "D";
		}else {
			ch = "F";
		}
		
		return ch;
	}
	
	public static String Score(int score) {
		int res = (int)(score/10);
		switch(res) {
		case 10 : return "A";
		case 9 : return "A";
		case 8 : return "B";
		case 7 : return "C";
		case 6 : return "D";
		default : return "F";
		}
	}
}
