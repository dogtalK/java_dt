package day22.practice.phone.controller;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import day22.practice.phone.vo.Phone;
import day22.practice.student.controller.Program;

public class PhoneManager implements Program{
	
	private final static int EXIT = 4;
	private Scanner sc = new Scanner(System.in);
	
	private List<Phone> list = Arrays.asList(
			new Phone(010-1234-5678, 1, "a", "family"),
			new Phone(010-1111-2222, 1, "b", "family"),
			new Phone(010-1111-2222, 1, "c", "family"),
			new Phone(010-1111-2222, 1, "d", "friend"),
			new Phone(010-1212-3434, 0, "e", "friend"),
			new Phone(010-1212-3434, 0, "f", "friend"),
			new Phone(010-1212-3434, 0, "g", "friend")
			);

	@Override
	public void run() {
		int menu;
		do {
			try {
				printMenu();
				menu = sc.nextInt();
				
				runMenu(menu);
			}catch(InputMismatchException e) {
				menu = EXIT-1;
				sc.nextLine();
				System.out.println("Wrong Input!");
			}
		}while(menu != EXIT);
	}
	
	@Override
	public void printMenu() {
		System.out.println("MENU");
		System.out.println("1. Insert");
		System.out.println("2. Update");
		System.out.println("3. Search");
		System.out.println("4. EXIT");
		System.out.print("Menu Select : ");
	}

	@Override
	public void runMenu(int menu) {
		int phoneNumber = 0, bookMark = -1;
		String name = "", group = "";
		switch(menu) {
		case 1:
			InsertPhoneNumber();
			break;
		case 2:
			UpdatePhoneNumber();
			break;
		case 3:
			if(phoneNumber !=0) {
				SearchPhoneNumber1(phoneNumber);				
			}else if(bookMark != -1) {
				SearchPhoneNumber2(bookMark);				
			}else if(!name.equals("")) {
				SearchPhoneNumber3(name);
			}else if(!group.equals("")) {
				SearchPhoneNumber4(group);
			}else {
				
			}
			break;
		case 4:break;
		default : System.out.println("Wrong number");
		}
		
	}

	private void InsertPhoneNumber() {
		// TODO Auto-generated method stub
		
	}

	private void UpdatePhoneNumber() {
		// TODO Auto-generated method stub
		
	}

	private void SearchPhoneNumber1(int phoneNumber) {
		// TODO Auto-generated method stub
		
	}
	private void SearchPhoneNumber2(int bookMark) {
		// TODO Auto-generated method stub
		
	}
	private void SearchPhoneNumber3(String name) {
		// TODO Auto-generated method stub
		
	}
	private void SearchPhoneNumber4(String group) {
		// TODO Auto-generated method stub
		
	}

	
	
}
