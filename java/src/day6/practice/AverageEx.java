package day6.practice;

import java.util.Scanner;

public class AverageEx {

	public static void main(String[] args) {
		// 국영수 성적을 입력받아 평균을 구하는 코드를 작성하세요.
		/* input 3 score(kor, eng, math) : 10 20 30
		 * average : 20.0
		 * continue?(y/n) :
		 * y
		 * input 3 score(kor, eng, math) : 10 20 30
		 * average : 20.0
		 * continue?(y/n) :
		 * n
		 * EXIT!
		 */
		
		Scanner sc = new Scanner(System.in);
		char ch = 'a';
		int kor, eng, math;
		
		
		while(ch != 'n') {
			System.out.println("input 3 score(kor, eng, math) : ");
			kor = sc.nextInt(); eng = sc.nextInt(); math = sc.nextInt();
			double avg = ((double)kor + eng + math)/3; 
			System.out.println("average : " + avg);
			System.out.println("continue?(y/n) : ");
			ch= sc.next().charAt(0);
		}
		System.out.println("EXIT!");

		sc.close();
	}

}
