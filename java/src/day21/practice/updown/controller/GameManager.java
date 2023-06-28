package day21.practice.updown.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import day21.practice.updown.vo.RecordGame;

public class GameManager implements Program {

	//리터럴 3에 이름을 붙여서 명확하게 전달하기 위해.
	private static final int EXIT = 3;
	
	//다른 메서드에서 매번 객체를 생성하는게 번거로워서
	private Scanner sc = new Scanner(System.in);
	
	//기록을 저장하는 리스트
	private ArrayList<RecordGame> list = new ArrayList<>();

	@Override
	public void printMenu() {

		System.out.println("1. Play");
		System.out.println("2. Record");
		System.out.println("3. EXIT");
		System.out.print("Select Menu : ");
		
	}

	@Override
	public void run() {
		System.out.println("Program Start!!");
		
		int menu;
		do {
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu);
			
		}while(menu != EXIT);
	}

	@Override
	public void runMenu(int menu) {
		switch (menu) {
		case 1:
			playGame();
			break;
		case 2:
			recordGame();
			break;
		case 3:break;
		default:
			System.out.println("Wrong menu!");
		}
		
	}

	private void recordGame() {
		for(RecordGame tmp : list) {
			System.out.println(tmp);
		}
		
	}

	private void playGame() {
		int min = 1, max = 100;
		int num = min-1;
		int random = (int)(Math.random() * (max - min +1) + min);
		System.out.println(random);
		int count = 0;
		
		while(random != num) {
			System.out.println("input number 1~100");
			num = sc.nextInt();;
			if(random > num) {
				System.out.println("Up!");
			}else if(random < num) {
				System.out.println("Down!");
			}else if(random == num) {
				System.out.println("Good");
			}else {
				System.out.println("wrong number");
			}
			count++;
		}
		//기록 아이디(입력), 플레이 횟수
		System.out.println("Record ID : ");
		String id = sc.next();
		//어떻게 저장해서 관리할것인가
		RecordGame rec = new RecordGame(id, count);
		list.add(rec);
		//sort();
		list.sort(new Comparator<RecordGame>() {

			@Override
			public int compare(RecordGame o1, RecordGame o2) {
				// TODO Auto-generated method stub
				return o1.getCount() - o2.getCount();
			}
		});
	}

	private void sort() {
		for(int i = 0; i < list.size()-1; i++) {
			for(int j =0; j <list.size()-1; j++) {
				if(list.get(j).getCount() < list.get(j+1).getCount()) {
					RecordGame tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tmp);
				}
			}
		}
	}
}