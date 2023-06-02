package day4.ifex;

public class EvenNumberEx2 {
	
	/* if(조건식1){
	 * 		a=b;
	 * }else{
	 * 		a=c;
	 * }
	 * 위 조건문을 아래 조건연산자로 작성할 수 있음
	 * a = 조건식1 ? b : c;
	 */

	public static void main(String[] args) {
		//홀짝 판별예제를 조건 연산자를 이용하여 작성
		int num =4;
		String result = num % 2 == 0 ? "even" : "odd" ;
		
		System.out.println(num + " is a " + result + " number.");
	}

}
