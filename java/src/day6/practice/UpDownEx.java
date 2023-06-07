package day6.practice;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		// 1~100사이의 랜덤한 정수를 생성하고, 이 정수를 맞추는 게임을 구현하세요
		/* 랜덤한 수 : 45
		 * input : 50
		 * Down!
		 * input : 40
		 * Up!
		 * input : 45
		 * Good!
		 */
		Scanner sc = new Scanner(System.in);
		/*
		int min = 1, max = 100;
		int random;
		
		int num;
		char ch = 'a';
		while(ch != 'n') {
			random = (int)(Math.random() * (max - min +1) + min);
			num = 0;
			while(random != num) {
				System.out.println("input number 1~100");
				num = sc.nextInt();;
				if(random > num && num >= 1 && num < 101) {
					System.out.println("Up!");
				}else if(random < num && num >= 1 && num < 101) {
					System.out.println("Down!");
				}else if(random == num) {
					System.out.println("Good");
				}else {
					System.out.println("wrong number");
				}
			}
			System.out.println("continue? y/n");
			ch = sc.next().charAt(0);
		}
		
		System.out.println("EXIT!");
		*/
		
		int min = 1, max = 100;
		int random;
		int num;
		char menu;
		do {
			random = (int)(Math.random() * (max - min +1) + min);
			do {
				System.out.println("input number");
				num = sc.nextInt();
				
				if(num > random) {
					System.out.println("Down!");
				}else if(num < random) {
					System.out.println("Up!");
				}else {
					System.out.println("Good!");
				}
			}while(random != num);
			System.out.println("continue? y/n");
			menu = sc.next().charAt(0);
		}while(menu != 'n');
		
		
		sc.close();
	}

}
