package db.day2.board.controller;

import java.sql.Connection;
import java.util.Scanner;

import db.day2.board.service.MemberService;
import db.day2.board.service.MemberServiceImp;

public class MemberController {
	
	private Connection con;
	private Scanner sc;
	private MemberService memberService;

	public MemberController(Connection con, Scanner sc) {
		this.con = con;
		this.sc = sc;
		memberService = new MemberServiceImp(con);
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
			System.out.println("member menu exit");
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
		System.out.println("====member menu====");
		System.out.println("1. signup");
		System.out.println("2. withdraw");
		System.out.println("3. backspace");
		System.out.println("===================");
		System.out.println("menu select : ");
		
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
