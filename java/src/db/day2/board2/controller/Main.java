package db.day2.board2.controller;

import java.util.Scanner;

public class Main {

	private static MemberController memberController;
	private static BoardController boardController;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu;
		final int EXIT = 3;
		memberController = new MemberController(sc);
		boardController = new BoardController(sc);
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = sc.nextInt();
			//메뉴 실행
			runMenu(menu);
		}while(menu != EXIT);
		
		sc.close();
	}
	
	private static void runMenu(int menu) {
		
		switch(menu) {
		case 1:
			memberController.run();
			break;
		case 2:
			boardController.run();
			break;
		case 3:
			System.out.println("program off");
			break;
		default:
			System.out.println("worng menu");
		}
	}
	private static void printMenu() {
		System.out.println("=======menu=======");
		System.out.println("1. member menu");
		System.out.println("2. board menu");
		System.out.println("3. program exit");
		System.out.println("=================");
		System.out.print("menu select : ");
	}
}