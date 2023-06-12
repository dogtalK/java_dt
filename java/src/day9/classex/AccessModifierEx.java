package day9.classex;

import day9.classex2.B;

public class AccessModifierEx {
	
	/* 접근제어자
	 * 클래스의 멤버변수, 메서드, 생성자에 대한 접근을 지정하는 예약어
	 * private		자신
	 * (default)	자신 + 같은 패키지
	 * protected	자신 + 같은 패키지 + 자식
	 * public		모두
	 */
	/* 클래스는 멤버면수, 메서드, 생성자로 구성
	 * 멤버변수 : 속성
	 * 메서드 : 기능
	 * 
	 * 자동차
	 * 속력을 올림
	 * 자동차 색상을 검은색
	 * 
	 * 				자동차	:	클래스
	 * 			속력을 올림	: 	메서드
	 * 			자동차 색상	:	멤버면수
	 * 공장에서 막 나온 자동차	: 	생성자
	 */

	public static void main(String[] args) {
		A a = new A();
		B b = new B();

		//AccessModifier 클래스와 A 클래스는 같은 패키지에 있는 클래스
		//AccessModifier 클래스와 B 클래스는 다른 패키지에 있는 클래스
		//num3은 접근제어자가 public. 같은 패키지이든 아니든 상관 없음
		a.num3 = 10;
		b.num3 = 20;
		
		//num2는 접근제어자가 디폴트(생략됨). 다른 패키지에 있는 B클래스 객체는 접근이 안됨
		a.num2 = 10;
		//b.num2 = 20;
		
		//num1은 접근제어자가 private
		//같은 패키지이든 아니든 다른 클래스에서 접근할 수 없음
		//a.num1 = 10;
		//setter를 통해 값을 변경
		a.setNum1(10);
		//getter를 통해 값을 가져옴
		System.out.println(a.getNum1());
		//b.num2 = 20;
	}

}

class A{
	private int num1;
	int num2;
	public int num3;
	/**클래스 A의 객체 num1을 출력하는 메서드
	 * 매개변수 : 없음 => 이미 알고 있는 내 정보 num1이기 때문에
	 * 리턴타입 : 없음 => void
	 * 매서드명 : print
	 */
	public void print() {
		//num1은 private이기 때문에 A클래스의 메서드에서 호출 될 수 있다.
		//이미 알고있는 내 정보를 활용하는 경우 매개변수로 전달받지 않아도 됨.
		System.out.println(num1);
	}
	//private으로 된 num1에 접근하기 위해서 getter를 추가
	public int getNum1() {
		return num1;
	}
	//private으로 된 num1에 값을 변경하기 위해서 setter를 추가
	public void setNum1(int _num1) {
		num1 = _num1;
	}
}