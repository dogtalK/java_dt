package day4.homework;

import java.util.Scanner;

public class NumberEx {

	public static void main(String[] args) {
		//정수 num가 짝수면 num에 2를 나누고, 정수 num가 홀수면 num에 1을 더한 후 , num을 출력하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input num");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num/2);
		}else if(num % 2 == 1) {
			System.out.println(num+1);
		}else {
			System.out.println("wrong input");
		}
		
		sc.close();
	}

}
