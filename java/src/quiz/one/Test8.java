package quiz.one;

public class Test8 {

	public static void main(String[] args) {
		int num = 3;
		System.out.println(num + " is even number? : " + isEven(num));

	}

	//홀짝을 판별하는 메서드
	//메서드는 리턴타입이 있음ㄴ 어떤 상황에서라도 반드시 해당 타입으로 리턴을 해줘야 함
	//아래 코드는 홀수일 때 리턴을 안함 => 에러가 발생
	public static boolean isEven(int num) {
		if(num%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
}
