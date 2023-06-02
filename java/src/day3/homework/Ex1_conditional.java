package day3.homework;

import java.util.Scanner;

public class Ex1_conditional {
	
	/*
	성별(M:남성,W:여성)를 입력받아 여성인지 확인하는 코드를 작성하세요. 조건 연산자 이용
	(package : day3.homework, file : Ex1_conditional) 
	input gender : 
	M
	Are you a women? false

	input gender : 
	W
	Are you a women? true
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input gender");
		String gender = sc.nextLine();
		
		String woman =  "w";
		
		gender = woman.equals(gender) ? "true" : "false";
		
		System.out.println("Are you a women? " + gender);
		
		sc.close();
		
		/*강사님 코드
		char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender");
		gender = sc.next().charAt(0);
		
		boolean result = gender != 'm' ? true : false;
		
		System.out.println("Are you a women? " + result);
		
		sc.close();
		*/

	}

}
