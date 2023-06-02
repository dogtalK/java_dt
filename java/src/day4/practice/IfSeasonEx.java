package day4.practice;

import java.util.Scanner;

public class IfSeasonEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input 1~12");
		
		/*
		int num = sc.nextInt();
		if(num > 2 && num < 6) {
			System.out.println("The season is spring");
		}else if(num > 5 && num < 9) {
			System.out.println("The season is summer");
		}else if(num > 8 && num < 12) {
			System.out.println("The season is autumn");
		}else if(num > 0 && num < 13)//(num == 12 || (num >= 1 && num <= 2 {
			System.out.println("The season is winter");
		}else {
			System.out.println("input error");
		}
		*/
		
		int num = sc.nextInt();
		if(num == 3 || num == 4 || num == 5) {
			System.out.println("The season is spring");
		}else if(num == 6 || num == 7 || num == 8) {
			System.out.println("The season is summer");
		}else if(num == 9 || num == 10 || num == 11) {
			System.out.println("The season is autumn");
		}else if(num == 12 || num == 1 || num == 2) {
			System.out.println("The season is winter");
		}else {
			System.out.println("input error");
		}
		
		sc.close();
	}

}
