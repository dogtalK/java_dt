package day26.library.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import day26.library.vo.Book;
import day26.library.vo.LoanBrowsing;

public class LibraryController {

	private Scanner sc = new Scanner(System.in);
	//도서 리스트
	List<Book> bookList = new ArrayList<>();
	//대출 열람 리스트
	List<LoanBrowsing> loanList = new ArrayList<>();
	
	public void run() {
		
		int menu;
		String bookFileName = "src/day26/library/book.txt";
		
		loadBook(bookFileName);
		do {
			//메뉴 출력
			System.out.println("===========");
			printMenu();
			//메뉴 선택(메뉴를 입력받음) : Scanner 필요
			menu = sc.nextInt();
			//선택된 메뉴에 따른 기능을 실행
			runMenu(menu);
			System.out.println("===========");
			
		}while(menu != 4);
		saveBook(bookFileName);
		sc.close();
	}

	private void saveBook(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
				for(Book tmp : bookList) {
					oos.writeObject(tmp);
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void loadBook(String fileName) {
		try(ObjectInputStream ois
				= new ObjectInputStream(new FileInputStream(fileName))){
			while(true) {
				Book tmp = (Book)ois.readObject();
				bookList.add(tmp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("don't find File");
		} catch (EOFException e) {
			System.out.println("Finished reading the File");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//ObjectinputStream을 이용하여 객체단위로 읽어올 때 클래스가 Serializable인터페이스를 구현하지 않으면 발생
			System.out.println("don't find Book class");
		}
	}

	private void printMenu() {
		System.out.println("menu");
		System.out.println("1. add");
		System.out.println("2. loan");
		System.out.println("3. return");
		System.out.println("4. exit");
		System.out.print("menu select : ");
	}
	
	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertBook();
			break;
		case 2:
			loanBook();
			break;
		case 3:
			returnBook();
			break;
		case 4:
			System.out.println("program exit");
			break;
		default :
			System.out.println("Wrong menu");
		}
		
	}

	private void returnBook() {
		bookList
			.stream()
			.filter(b -> b.isLoan())//대출한 도서만 추출
			.forEach(b->{//추출한 도서를 출력
			System.out.println("===========");
			System.out.println(b);
			System.out.println("===========");
		});
		
		//도서 번호를 입력
		sc.nextLine();
		System.out.print("book number : ");
		String num =sc.nextLine();
		
		boolean possible 
		= bookList
			.stream()
			.filter(b -> b.isLoan() && b.getNum().equals(num))
			.count() > 0;
		//올바르지 않으면 (없는 도서번호이거나, 대출중인 도서인 경우)
		//대출할 수 없다고 출력
		if(!possible) {
			System.out.println("it don't have a loan");
			return;
			}
		
		int index = bookList.indexOf(new Book(num, null, null, null));
		Date loanDate = new Date();
		LoanBrowsing lb = new LoanBrowsing(bookList.get(index) , loanDate, 14);
		
		loanList.remove(lb);
		bookList.remove(index).loanBook();
		
		System.out.println("return day : " + lb.getReturnDateStr());
	}

	private void loanBook() {
		//대출 가능한 도서들을 조회
		//Stream<Book> stream = bookList.stream();
		bookList
			.stream()
			.filter(b -> !b.isLoan())//대출 가능한 도서만 추출
			.forEach(b->{//추출한 도서를 출력
			System.out.println("===========");
			System.out.println(b);
			System.out.println("===========");
		});
		/*
		for(Book tmp : bookList) {
			if(!tmp.isLoan()) {
				System.out.println("===========");
				System.out.println(tmp);
				System.out.println("===========");
			}
		}
		*/
		//도서 번호를 입력
		sc.nextLine();
		System.out.print("book number : ");
		String num =sc.nextLine();
		
		//대출을 신청
		//도서번호가 올바른지 확인
		//번호에 맞는 도서가 있는지 확인
		//도서가 없으면 올바르지 않음
		//도서가 있으면 대출중인지 확인
		boolean possible 
			= bookList
				.stream()
				.filter(b -> !b.isLoan() && b.getNum().equals(num))
				.count() > 0;
		//올바르지 않으면 (없는 도서번호이거나, 대출중인 도서인 경우)
		//대출할 수 없다고 출력
		if(!possible) {
			System.out.println("don't loan");
			return;
		}
		
		//올바르면 대출을 진행
		//도서 대출 객체를 생성. 도서, 대출일, 대출기간
		int index = bookList.indexOf(new Book(num, null, null, null));
		Date loanDate = new Date();
		LoanBrowsing lb = new LoanBrowsing(bookList.get(index) , loanDate, 14);
		//대출열람 리스트에 추가
		loanList.add(lb);
		bookList.get(index).loanBook();
		//대출일을 출력
		System.out.println("loan day : " + lb.getLoanDateStr());
		//반납예정일 출력
		
	}

	private void insertBook() {
		String num, title, author, isbn;
		Book book;
		
		System.out.print("number : ");
		sc.nextLine();
		num = sc.nextLine();
		System.out.print("title : ");
		title = sc.nextLine();
		System.out.print("author : ");
		author = sc.nextLine();
		System.out.print("isbn : ");
		isbn = sc.nextLine();
		
		book = new Book(num, title, author, isbn);
		bookList.add(book);
		
	}
}
