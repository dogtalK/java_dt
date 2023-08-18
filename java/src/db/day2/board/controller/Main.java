package db.day2.board.controller;

import java.sql.*;
import java.util.Scanner;

public class Main {

	private static Connection con = null;
	private static MemberController memberController;
	private static BoardController boardController;
	
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/test";
		String dbId = "root";
		String dbPw = "root";
		
		con =connect(url, dbId, dbPw);
		if(con != null) {
			System.out.println("connect success");
		}else{
			System.out.println("connect fail");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		int menu;
		final int EXIT = 3;
		memberController = new MemberController(con, sc);
		boardController = new BoardController(con, sc);
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = sc.nextInt();
			//메뉴 실행
			runMenu(menu);
		}while(menu != EXIT);
		
		sc.close();
		close(con);
		
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
			System.out.println("program exit");
			break;
		default:
			System.out.println("worng menu");
		}
		
	}

	private static void printMenu() {
		System.out.println("=======menu======");
		System.out.println("1. member menu");
		System.out.println("2. board menu");
		System.out.println("3. EXIT");
		System.out.println("=================");
		System.out.println("menu select");
		
	}

	private static Connection connect(String utl, String id, String pw) {
		try {
			return DriverManager.getConnection(utl, id, pw);
		} catch (SQLException e) {
			return null;
		}
	}
	private static void close(Connection con) {
		try {
			//연결한 connection을 닫아줌
			if(con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {}
	}
}
