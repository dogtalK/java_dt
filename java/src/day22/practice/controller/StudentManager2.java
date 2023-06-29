package day22.practice.controller;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import day20.practice.student.controller.Program;
import day22.practice.vo.Student;

public class StudentManager2 implements Program{
	
	private final static int EXIT = 4;
	private Scanner sc = new Scanner(System.in);
	
	private List<Student> list = Arrays.asList(
			new Student(1, 1, 1, "Hong"),
			new Student(1, 1, 2, "Ling"),
			new Student(2, 1, 1, "Park"),
			new Student(3, 1, 1, "Lee"),
			new Student(3, 3, 2, "Kim")
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
		System.out.println("Menu");
		System.out.println("1. All");
		System.out.println("2. Grade");
		System.out.println("3. Search");
		System.out.println("4. EXIT");
		System.out.print("Menu Select : ");
		
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			print(s->true);
			break;
		case 2:
			//검색할 학년 입력
			System.out.println("grade");
			final int grade1 = sc.nextInt();
			print(s->s.getGrade() == grade1);
			break;
		case 3:
			//검색할 학년, 반, 번호 입력
			System.out.print("grade : ");
			final int grade2 = sc.nextInt();
			System.out.print("class : ");
			final int classNum2 = sc.nextInt();
			System.out.print("number : ");
			final int num2 = sc.nextInt();
			print(s->s.equals(new Student(grade2, classNum2, num2, "")));
			break;
		case 4:	break;
		default:
		}
	}
	private void print(Predicate<Student> p) {
		for(Student tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}
	
}
