package day4.practice;

import java.util.Scanner;

public class IfMultipleEx1 {

	public static void main(String[] args) {
		//정수 num를 입력받아 num가 2의 배수인지 아닌지 판별하는 코드작성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input number");
		int num = sc.nextInt();
		
		/*
		if(num % 2 == 0) {
			System.out.println(num + " is an even number");
		}else if(num % 2 == 1 || num % 2 == -1){
			System.out.println(num + " is not an even number");
		}else {
			System.out.println("0");
		}
		*/
		if(num % 2 == 0) {
			System.out.println(num + " is an even number");
		}else {
			System.out.println(num + " is not an even number");
		}
		
		sc.close();
	}

}
