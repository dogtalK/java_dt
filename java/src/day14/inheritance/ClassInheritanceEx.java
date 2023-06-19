package day14.inheritance;

import lombok.Data;

public class ClassInheritanceEx {
	
	/*상속
	 * 부모에게 물려 받는것
	 * =>부모에게 물려 받은 것들을 사용할 수 있다
	 * =>전부는 아니고 일부(접근 제어자에 따라서)
	 */
	/*클래스의 상속
	 * 클래스 A의 멤버변수와 메서드를 클래스 B가 물려 받는것
	 * 클래스 A : 부모 클래스, 상위 클래스
	 * 클래스 B : 자식 클래스, 하위 클래스
	 * B는 A이다라고 표현 가능할 때 상속
	 * 사람은 포유류이다.
	 * 사람 클래스 : 자식 클래스
	 * 포유류 클래스 : 부모 클래스
	 * extends 예약어를 이용하여 상속
	 * class B extends A{}
	 * 클래스 상속은 단일 상속만 가능하다 = >부모가 하나
	 * 상속은 멤버변수와 메서드를 편하게 사용하기 위해 받는게 아니라 B is a A가 성립될때만 해야 함
	 */
	/*접근 제어자 protected
	 * 부모 클래스에서 같은 패키지의 클래스와 자식 클래스에서만 접근 가능하게 하고 싶을 때 사용
	 * 부모 클래스에서 자식 클래스에서도 사용하지 못하게 할 때는 private
	 * =>private 멤버변수와 메서드도 물려는 받음. 그러나 사용은 못함
	 */
	/*자식 클래스의 객체 생성
	 * 자식 클래스가 객체를 생성할 때
	 * 부모 클래스의 멤버 변수가 먼저 생성되고 부모 클래스의 생성자로 초기화 한 후
	 * 자식 클래스의 나머지 멤버 변수가 생성된 후 자식 클래스의 생성자로 초기화 한다
	 */
	/*super. super()
	 * super
	 * -부모 클래스의 주소를 알고있는 예약어
	 * super()
	 * -부모 클래스의 생성자
	 * -자식 클래스의 생성자에서 첫줄에 씀
	 * -자식 클래스의 생성자는 반드시 부모생성자를 호출 없다면 기본 부모 생성자인 super()가 생략된 것
	 */
	/*메서드 오버라이딩
	 * 부모 클래스에 있는 메서드를 재정의 하는 것
	 * @Override 어노테이션을 붙일 수 있다.
	 * -오버라이딩 메서드입을 알려주고, 문법에 맞는지 체크
	 * 리턴타입, 메서드명, 매개변수는 수정하면 안됨
	 * 접근제어자를 넙ㄹ은 법위로 넓히는건 가능 좁히는건 불가능
	 * 부모클래스의 메서드 A가 public 이면 자식클래스에서 오버라이딩할 때 public만 가능
	 * private, protected, 디폴트로 변경 불가능
	 */
	/*클래스 형변환
	 * 부모 클래스의 객체를 자식 클래스의 객체로 변환하거나
	 * 자식 클래스의 객체를 부모 클래스의 객체로 변환하는 것
	 */
	/*업 캐스팅
	 * 묵시적 클래스 형변환이라고도 함
	 * 자식 클래스의 객체를 부모 클래스의 객체론 변환
	 * 자동으로 변환됨
	 * 부모클래스명 객체명 = new 자식클래스생성자();
	 * 부모클래스명 객체명 = 자식클래스 객체명;
	 */
	/*다운 캐스팅
	 * 부모 클래스의 객체를 자식 클래스의 객체로 형변환
	 * 자동으로 안됨 반드시 (자식클래스명) 으로 처리
	 * 조건부로 가능
	 * -업캐스팅괸 객체를 다운캐스팅 하는 경우
	 * 부모클래스 객체명1 = new 부모클래스생성자();
	 * 자식클래스 객체명2 = (자식클래스)객체명1;//안됨 에러발생
	 * 부모클래스 객체명1 = new 자식클래스 생성자();//업 캐스팅
	 * 자식 클래스 객체명2 = (자식클래스)객체명1;//가능
	 */
	/*instanceof연산자
	 * 클래스 형변환이 가능한지 확인하는 연산자
	 * 객체명 instanceof 클래스명 형태로 상ㅇ하며 결과는 true/false
	 * if(a instanceif B){}
	 */

	public static void main(String[] args) {
		/* 스마트폰은 폰이다 => 상속
		 * - 스마트폰 : 자식 클래스
		 * - 폰 : 부모 클래스
		 * 스마트폰은 카메라를 가지고 있다 => 포함
		 * - 스마트폰 : 클래스
		 * - 카메라 : 멤버변수
		 * 부모 클래스에게 상속 받은 기능들은 사용할 수 있다
		 * - 접근제어자가 public m protected인 경우
		 * - 디폴트는 같은 패키지인 경우는 가능하나 다른 패키지이면 불가능
		 */
		
		
		SmartPhone phone1 = new SmartPhone();
		phone1.call("010-1234-5678");
		phone1.ansewr("02-123-4567");
		System.out.println(phone1.getNum());
		phone1.take();
		//다운 캐스팅 : 안되는 경우
		Phone p1 = new Phone("010-123-3456");
		//문법적으로 에러가 발생하지 않지만 예외가 발생 : 다운 캐스팅이 안되는 경우이기 때문에
		//SmartPhone c1 = (SmartPhone) p1;
		if(p1 instanceof SmartPhone) {
			SmartPhone c1 = (SmartPhone) p1;
			c1.call("num num");
		}
		
		//다운 캐스팅 : 되는 경우
		//업캐스팅이 된 객체 ㅔ2
		Phone p2 = new SmartPhone();//업캐스팅
		SmartPhone c2 = (SmartPhone)p2;
		c2.call("123-4567");
		
	}

}
@Data
class Phone{
	private String num = "010-1111-5555";//전화번호
	
	//전화 걸기
	public void call(String num) {
		System.out.println(num);//내가 전화를 거는 상대방 번호
		System.out.println("calling....");
	}
	//전화 받기
	public void ansewr(String num) {
		System.out.println(num);//나한테 전화를 건 상대방 번호
		System.out.println("Answering...");
	}
	public Phone(String num) {
		this.num = num;
	}
	//public Phone(){}//생성자가 하나도없으면 컴파일할 때 기본 생성자가 자동으로 추가
}
class SmartPhone extends Phone{
	Camera camera = new Camera();
	public void take() {
		camera.take();
	}
	public SmartPhone() {
		//부모 클래스의 생성자가 호출
		//super()를 이용하여 부모 클래스의 생성자를 직접 호출하지 않으면
		//기본생성자인 super()가 자동으로 추가가 되고 호출이 됨.
		//이 때, 부모 클래스의 기본 생성자가 없으면 에러가 발생
		//super();//에러발생
		super("");
	}
	@Override
	public void call(String num) {
		super.call(num);
		System.out.println("SmartPhone!");
	}
}

class Camera{
	public void take() {
		System.out.println("take a picture");
	}
}