package day3.operator;

public class LogicalEx {
	
	/*논리 연산자
	 * 항이 boolean값이어야하고 결과값도 boolean
	 * &&, ||, !
	 * && : ~하고, and, 둘다 참이면 참
	 * || : ~하거나, or, 둘 중 하나라도 참이면 참
	 * ! : ~아닌, 반대, not, 참이면 거짓, 거짓이면 참
	 */

	public static void main(String[] args) {
		int score = 75;
		//성적이(score) 80점이상이고, 성적이 90점 미만인가?
		//score가 80보다 크거나 같고 score가 90보다 작다
		//score가 80보다 크거나 같다 && score가 90보다 작다
		//score >=80 && score < 90
		System.out.println("Is " + score + " a B? " + (score >= 80 && score < 90));
		
		int age = 21;
		//20세 이상이면 성인
		boolean isAdult = age >= 20;
		//age살은 미성년자 인가?
		System.out.println("Is " + age + " years old a minor? " + !isAdult);
		
		//주문등록증은 있고 ,운전면허증이 없음
		boolean hasIdCard = true;
		boolean hasDriverCard = false;
		//토익을 볼 수 있을까요?(주민등록증이 있거나 운전명허증이 있으면 응시할 수 있음)
		System.out.println("Can I take TOEIC? " + (hasIdCard || hasDriverCard));
	}

}
