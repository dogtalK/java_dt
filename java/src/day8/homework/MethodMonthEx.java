package day8.homework;

import java.util.Scanner;

public class MethodMonthEx {

	public static void main(String[] args) {
		// 월을 입력받아 월에 맞는 영어를 출력하세요

		Scanner sc = new Scanner(System.in);
		System.out.println("input month");
		
		int month = sc.nextInt();
		
		System.out.println(month + " is " + engMonth(month));
		
		sc.close();
	}

	public static String engMonth(int month) {
		String ch = null;
		switch(month){
		case 1:
			ch = "January";
			break;
		case 2:
			ch = "February";
			break;
		case 3:
			ch = "March";
			break;
		case 4:
			ch = "April";
			break;
		case 5:
			ch = "May";
			break;
		case 6:
			ch = "June";
			break;
		case 7:
			ch = "July";
			break;
		case 8:
			ch = "August";
			break;
		case 9:
			ch = "September";
			break;
		case 10:
			ch = "October";
			break;
		case 11:
			ch = "November";
			break;
		case 12:
			ch = "December";
			break;
			
		}
		return ch;
		
	}
}
