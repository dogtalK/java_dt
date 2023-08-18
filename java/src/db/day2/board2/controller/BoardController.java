package db.day2.board2.controller;

import java.util.ArrayList;
import java.util.Scanner;

import db.day2.board2.service.BoardService;
import db.day2.board2.service.BoardServiceImp;
import db.day2.board2.vo.BoardVO;

public class BoardController {
	
	private Scanner sc;
	private BoardService boardService;
	
	public BoardController(Scanner sc) {
		this.sc = sc;
		boardService = new BoardServiceImp();
	}

	public void run() {
		//게시글 등록, 수정, 삭제, 게시글 리스트 조회
		int menu;
		final int EXIT = 5;
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
		}while(menu != EXIT);
	}

	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertBoard();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			printBoardList();
			break;
		case 5:
			break;
		default:
			System.out.println("worng menu");
		}
		
	}

	private void printBoardList() {
		ArrayList<BoardVO> list = boardService.getBoardList();
		for(BoardVO tmp : list) {
			System.out.println(tmp);
		}
	}

	private void insertBoard() {
		//제목, 작성자 id
		System.out.print("title : ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("ID  : ");
		String id = sc.next();
		if(boardService.insertBoard(title, id)) {
			System.out.println("board upload success");
		}else {
			System.out.println("board upload fail");
		}
	}

	private void printMenu() {
		System.out.println("=====board menu=====");
		System.out.println("1. board upload");
		System.out.println("2. board modify");
		System.out.println("3. board delete");
		System.out.println("4. board search");
		System.out.println("5. previous menu");
		System.out.println("==================");
		System.out.print("menu select : ");
	}

}