package day11.array;

import java.util.Scanner;

public class ArrayEx1 {
	/*배열
	자료형이 같은 변수들을 모아 놓은것.
	사용하는 이유
	-관리가 편하다 변수 100개 관리하는 것보다 크기가 100인 배열 1개를 관리하는게 편하다
	-반복문을 이용하여 코드를 효율적으로 작업할 수 있다.
	연속된 공간에 할당하기 때문에 탐색이 빠르다
	
	배열 선언과 초기화
	배열 선언
	-자료형[] 배열명 = new 자료형[갯수];
	-자료형 배열명[] = new 자료형[갯수]
	배열 초기화
	-다양한 방법이 있는데 잘 사용 안함
	-배열을 생성하면 따라 초기화를 하지 않아도 자료형에 맞게 초기화됨(멤버변수처럼)
	
	배열 사용하기
	배열명[번지]를 이용하여 변수처럼 사용
	번지는 0번지부터 배열의 크기 - 1번지까지 사용 가능
	잘못된 번지를 입력하면 ArrayIndexOutBounds 예외 발동
	*/

	public static void main(String[] args) {
		/* 학생들의 국어 성적을 저장하기 위한 배열을 생성하세요
		 * 학생들은 총 10명
		 */
		Scanner sc = new Scanner(System.in);
		double [] studentKoreaScore = new double [3];
		
		for(int i = 0; i < 3; i++) {
			System.out.print("input : " );
			studentKoreaScore[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(studentKoreaScore[i]);
		}
		/* 학생 3명의 국어 점수 평균을 구하고 출력하는 코드를 작성하세요*/
		double avr = (studentKoreaScore[0] + studentKoreaScore[1] + studentKoreaScore[2])/3;
		System.out.println("Score avr : " + avr);
		
		double sum = 0.0;
		for(int i = 0; i < 3; i++) {
			sum += studentKoreaScore[i];
		}
		double average = sum / 3;
		System.out.println("average : " + average);
		sc.close();

	}

}
