package day11.practice;

public class ArrayRandomEx {

	public static void main(String[] args) {
		// 1~9 사이의 랜덤한 수 3개를 만들어서 배열에 저장한 후 출력하는 코드를 작성하세요
		
		int [] randomNumber = new int[3];
		
		for(int i = 0; i < 3; i++) {
			int min = 1, max = 9;
			randomNumber[i] = (int)(Math.random() * (max - min +1) + min);
			//System.out.println(randomNumber[i]);
		}
		System.out.println(randomNumber[0]);
		System.out.println(randomNumber[1]);
		System.out.println(randomNumber[2]);
	}

}
