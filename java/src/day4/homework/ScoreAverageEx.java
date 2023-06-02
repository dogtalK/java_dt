package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {
		//국어, 영어, 수학 성적을 입력받아 편균을 출력하는 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input korScore");
		int korScore = sc.nextInt();
		
		System.out.println("input engScore");
		int engScore = sc.nextInt();
		
		System.out.println("input mathScore");
		int mathScore = sc.nextInt();
		
		double avg = ((double)korScore + engScore + mathScore) / 3;
		
		System.out.println("avg = " + avg);
				
		sc.close();
	}

}
