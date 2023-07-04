package quiz.one.student.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import quiz.one.student.vo.StudentList;

public class StudentController implements Program{
	Scanner sc = new Scanner(System.in);
	private final static int EXIT = 4;
	private StudentList sl = new StudentList();
	
	
	@Override
	public void run() {
		System.out.println("program start");
		 
		int menu;
		
		do {
			try {
				printMenu();
				System.out.print("input menu : ");
				menu = sc.nextInt();
				
				runMenu(menu);
			}catch(InputMismatchException e) {
				menu = -1;
				sc.nextInt();
				System.out.println("Wrong Input");
			}
			
		}while(menu != EXIT);
	}

	@Override
	public void printMenu() {
		System.out.println("1. Student add");
		System.out.println("2. Student info");
		System.out.println("3. EXIT");
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			StudentAdd();
			break;
		case 2:
			StudentInfo();
			break;
		case 3:
			break;
		default :
			System.out.println("Worng number");
		}
	}

	private void StudentInfo() {
		
	}

	private void StudentAdd() {
		System.out.print("name : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("input name");
		sc.nextLine();
		String major = sc.nextLine();
		
		if(sl.addStd(name, major)) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
	}

}
