package day3.quiz;
import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input score");
		int score = sc.nextInt();
		
		String result;
		result = score >= 60 ? "pass" : "fail";
		
		System.out.println("Do you pass " + score + " point? " + result);
		
		sc.close();

	}

}
