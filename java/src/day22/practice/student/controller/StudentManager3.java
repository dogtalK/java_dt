package day22.practice.student.controller;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

import day20.practice.student.controller.Program;
import day22.practice.student.vo.Student;

public class StudentManager3 implements Program{

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
		//int grade=1, classNum=1, num=1;
		int grade, classNum, num;
		Stream<Student> stream = list.stream();
		switch(menu) {
		case 1:
			//printAll();
			stream.forEach(std -> System.out.println(std));
			break;
		case 2:
			//검색할 학년 입력
			System.out.println("grade : ");
			grade = sc.nextInt();
			//printGrade(grade);
			/* filter는 매개변수로 Predicate 인터페이스의 객체가 필요
			 * Predicate를 구현한 익명클래스를 람다식으로 만든 후에 객체를 생성해서 전달
			 */
			stream
				.filter(std -> std.getGrade() == grade)
				//filter에 있는 매개변수는위 와 아래가 같은 동작
				.filter(new Predicate<Student>() {
					@Override
					public boolean test(Student t) {
						return t.getGrade() == grade;
					}
				})
				.forEach(std -> System.out.println(std));
			break;
		case 3:
			//검색할 학년, 반, 번호 입력
			System.out.print("grade : ");
			grade = sc.nextInt();
			System.out.print("class : ");
			classNum = sc.nextInt();
			System.out.print("number : ");
			num = sc.nextInt();
			//printSearch(grade, classNum, num);
			stream
				.filter(std -> std.equals(new Student(grade, classNum, num, "")))
				.forEach(std -> System.out.println(std));
			break;
		case 4:	break;
		default:
			System.out.println("wrong number");
		}
	}
/*
	private void printSearch(int grade, int classNum, int num) {
		Stream<Student> stream = list.stream();
		stream
			.filter(s -> s.getGrade() == grade)
			.filter(s -> s.getClassNum() == classNum)
			.filter(s -> s.getNum() == num)
			.forEach(list -> System.out.println(list));
		
	}

	private void printGrade(int grade) {
		Stream<Student> stream = list.stream();
		stream
			.filter(s -> s.getGrade() == grade)
			.forEach(list -> System.out.println(list));
		
	}

	private void printAll() {
		Stream<Student> stream = list.stream();
		stream
			.forEach(list -> System.out.println(list));
	}
	*/
}
