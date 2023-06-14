package day11.practice;

public class ArrayRandomEx2 {

	public static void main(String[] args) {
		// 1~9 사이의 랜덤한 수를 중복되지 않게 3개를 만들어서 배열에 저장한 후 출력하는 코드를 작성하세요
		
		//방법1 : 9번지까지 있는 배열을 이용
		//작업이 단순, 저장 공간이 필요
		int [] randomNumber = new int[3];
		boolean checkArr[] = new boolean[10];
		
		for(int i = 0; i < 3;) {
			int min = 1, max = 9;
			int random = (int)(Math.random() * (max - min +1) + min);
			//checkArr 배열에 random번지에 있는 값이 false이면
			if(!checkArr[random]) {
				//random은 저장하고 i증가하고 checkArr배열 값을 true로 변경
				randomNumber[i] = random;
				i++;
				checkArr[random] = true;
			}
			
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(randomNumber[i]);
		}
		System.out.println("===================");
		//방법2 : 저장된 값들을 비교
		
		int count = 0;//현재 저장된 랜덤수 개수
		int i = 0;//반복문에서 사용할 변수
		
		while(count < 3) {
			int min = 1, max = 9;
			int random = (int)(Math.random() * (max - min +1) + min);
			//이미 저장된 랜덤수들과 하나하나 비교해서 같은게 있는지 확인하여 있으면 반복문 종료
			for(i = 0; i < count; i++) {
				if(random == randomNumber[i]) {
					break;
				}
			}
			/* 위 반복문에서 break를 만나지 않으면 i는 count일 때 종료하기 때문에
			 * 반복문 종료 후 i는 count와 같다
			 * 하지만 break를 만나서 중간에 빠져 나오면 i는 count보다 작다.
			 */
			if(i == count) {
				randomNumber[count] = random;
				count++;
			}
		}
		
		for(i = 0; i < 3; i++) {
			System.out.println(randomNumber[i]);
		}
		System.out.println("===========");
		printArray(randomNumber,3);
		
		//방법3 : 방법2를 메서드로 변형
		count = 0;
		while(count <3) {
			int min = 1, max = 9;
			int random = (int)(Math.random() * (max - min +1) + min);
			//중복되지 않으면 배열에 저장 후 count 증가
			if(!contains(randomNumber, random, count)) {
				randomNumber[count] = random;
				count++;
			}
		}
		System.out.println("============");
		printArray1(randomNumber);
		// ==================================================
		int min = 1, max = 9;
		createRandomArray(min, max, randomNumber);
		System.out.println("============");
		printArray1(randomNumber);
	}
	/**정수형 배열이 주어지면, 정수형 배열의 값을 콘솔에 출력하는 메서드
	 * 매개변수 : 배열, 배열의 개수 => int randomNumber[], int size
	 * 리턴타입 : 없음 => void
	 * 메서드명 : printArray
	 */
	public static void  printArray(int randomNumber[], int size) {
		
		for(int i = 0; i < size; i++) {
			System.out.println(randomNumber[i]);
		}
	}
	//위 메서드랑 똑같은 기능을 한다
	public static void  printArray1(int randomNumber[]) {
		
		for(int i = 0; i < randomNumber.length; i++) {
			System.out.println(randomNumber[i]);
		}
	}
	/**정수 num가 배열의 0번지부터 count개 만큼 확인했을 때 중복된 값이 있는지 없는지 알려주는 메서드
	 * 매개변수 : 배열, 비교할 정수 num, 중복 값 => int randomNumber[], int num, int count
	 * 리턴타입 : 있는지 없는지 => boolean
	 * 메서드명 : contains
	 */
	public static boolean contains(int randomNumber[],int num, int count) {
		for(int i = 0; i < count; i++) {
			//중복되면 메서드를 종료하면서 중복됐다고 알려줌
			if(num == randomNumber[i]) {
				return true;
			}
		}
		/* 이 위치까지 왔다는건 return true를 못 만났다는 뜻이고,
		 * 그 말은 중복되지 않았다는 뜻
		 */
		return false;
	}
	/**min에서 max사이의 랜덤한 수를 생성해서 배열에 저장하는 메서드
	 * 매개변수 : 최소값, 최대값, 배열 = > int min, int max, int randomNumber[]
	 * 리턴타입 : 없음 => void
	 * 메서드명 : createRandomArray
	 */
	public static void createRandomArray(int min, int max, int randomNumber[]) {
		//랜덤으로 만들어지는 수의 개수가 배열의 크기보다 작으면 메서드를 종료
		//1~3 : 3개가 4개짜리 배열에 중복되지 않게 들어갈 수 없음
		if(randomNumber == null) {
			return;
		}
		if(max - min + 1 < randomNumber.length) {
			return;
		}
		int count = 0;
		while(count <3) {
			int random = (int)(Math.random() * (max - min +1) + min);
			//중복되지 않으면 배열에 저장 후 count 증가
			if(!contains(randomNumber, random, count)) {
				randomNumber[count] = random;
				count++;
			}
		}
	}
}
