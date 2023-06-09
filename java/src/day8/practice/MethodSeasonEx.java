package day8.practice;

import java.util.Scanner;

public class MethodSeasonEx {

	public static void main(String[] args) {
		// 월을 입력받아 계절을 출력하는 코드를 작성하세요

		Scanner sc = new Scanner(System.in);
		System.out.println("input month");
		int month = sc.nextInt();
		
		System.out.println(season(month));
		
		System.out.println(month + " is " + getSeason(month));
		
		sc.close();
		
	}
	
	public static int season(int month) {

		switch(month) {
		case 3: case 4: case 5:
			System.out.println("spring");
			break;
		case 6: case 7: case 8:
			System.out.println("summer");
			break;
		case 9: case 10: case 11:
			System.out.println("autorm");
			break;
		case 12: case 1: case 2:
			System.out.println("winter");
			break;
		default :
			System.out.println("wrong month");
		}
		return month;
	}
	/** 월이 주어지면 주어진 월에 맞는 계절을 알려주는 메서드
	 *  매개변수 : 월 => int, month
	 *  리턴타입 : 계절 => String
	 *  메서드명 : grtSeason
	 */
	public static String getSeason(int month) {
		if(month == 3 || month == 4 || month == 5 ) {
			return "Spring";
		}else if(month == 6 || month == 7 || month == 8 ) {
			return "Summer";
		}else if(month == 9 || month == 10 || month == 11 ) {
			return "Fall";
		}else if(month == 12 || month == 1 || month == 2 ) {
			return "Winter";
		}else {
			return "worng month";
		}	
	}
	
}
