package day16.homework.beverge.controller;

import java.util.Scanner;

public class BeverageMachine {

	Scanner sc = new Scanner(System.in);
	
	
	public void run() {
		System.out.println("프로그램 시작");
		
		int menu = -1;
		final int EXIT = 4;
		//반복 : 선택한 메뉴가 종료가 아닐때
		do {
			//메뉴 출력
			printMenu();
			
			//메뉴 선택
			menu = sc.nextInt();
			
			//선택한 메뉴에 따른 기능을 실행
			//runMenu(menu);
			
		}while(menu != EXIT);
		System.out.println("프로그램 종료");
		sc.close();
	}
	
	private void printMenu() {
		System.out.println("===============");
		System.out.println("메뉴");
		System.out.println("1. 금액 투입");
		System.out.println("2. 메뉴 선택");
		System.out.println("3. 제품 입고");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	}
	
	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("이용해주셔서 감사합니다");
			break;
		default :
			System.out.println("잘못된 메뉴");
		}
		
	}

}
