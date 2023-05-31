package day2.operator;

public class IncreaseOperatorEx {
	
	/*증감연산자
	 * ++, --
	 * 최종적으로 1증가/1감소
	 * 위치에 따라 전위형/후위형으로 나뉨
	 * ++변수 : 전위형, 증가하고 실행
	 * 변수++ : 후위형, 실행하고 증가
	 * 전위형 후위형이 헷갈리면 둘 중 한가지 방법만 통일해서 쓰자
	 */

	public static void main(String[] args) {
		int num1 = 10, num2 =10;
		System.out.println("작업 전 : " + num1 + "(전위형), " + num2 + "(후위형)");
		//전위형은 먼저 증가를 하고 동작을 하기 떄문에 num1을 증가 시킨 후 작업 중 문자열과 더함
		//후위형은 먼저 동작을 하고 증가를 하기 때문에 num2를 앞의 문자열과 더한 후에 num2를 증가 시킴
		System.out.println("작업 중 : " + ++num1 + "(전위형), " + num2++ + "(후위형)");
		System.out.println("작업 후 : " + num1 + "(전위형), " + num2 + "(후위형)");
		
		System.out.println("==================================================================");
		
		num1 = num2 =10;
		System.out.println("작업 전 : " + num1 + "(전위형), " + num2 + "(후위형)");
		++num1;
		System.out.println("작업 중 : " + num1 + "(전위형), " + num2 + "(후위형)");
		++num2;
		System.out.println("작업 후 : " + num1 + "(전위형), " + num2 + "(후위형)");

	}

}
