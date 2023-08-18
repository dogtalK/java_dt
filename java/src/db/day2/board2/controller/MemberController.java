package db.day2.board2.controller;

import java.util.Scanner;

import db.day2.board2.service.MemberService;
import db.day2.board2.service.MemberServiceImp;

public class MemberController {
	
	private Scanner sc;
	private MemberService memberService;

	public MemberController(Scanner sc) {
		this.sc = sc;
		memberService = new MemberServiceImp();
	}

	public void run() {
		int menu;
		final int EXIT = 3;
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
		}while(menu != EXIT);		
	}

	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			signup();
			break;
		case 2:
			withdraw();
			break;
		case 3:
			break;
		default:
			System.out.println("worng menu");
		}
	}

	private void withdraw() {
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		if(memberService.withdraw(id, pw)) {
			System.out.println("withdraw success");
		}else {
			System.out.println("withdraw fail");
		}
		
	}

	private void printMenu() {
		System.out.println("======member menu======");
		System.out.println("1. signup");
		System.out.println("2. withdraw");
		System.out.println("3. previous menu");
		System.out.println("==================");
		System.out.print("menu select : ");
		
	}
	
	private void signup() {
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		if(memberService.signup(id, pw)) {
			System.out.println("signup success");
		}else {
			System.out.println("signup fail");
		}
	}
}