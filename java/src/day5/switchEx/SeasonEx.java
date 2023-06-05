package day5.switchEx;

import java.util.Scanner;

public class SeasonEx {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("input month");
		int month = sc.nextInt();
		
		switch(month) {
		case 12: case 1: case 2:
			System.out.println("winter");
			break; //12와 1의 실행문이 없지만 브레이크문의 이용으로 2의 실행문이 실행되는것이다.
		case 3: case 4: case 5:
			System.out.println("spring");
			break;
		case 6: case 7: case 8:
			System.out.println("summer");
			break;
		case 9: case 10: case 11:
			System.out.println("autumn");
			break;
		default:
			System.out.println("wrong month");
		}

		sc.close();
	}
}
