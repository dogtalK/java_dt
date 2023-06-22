package day17.interfaceex;

import day15.practice.shop.controller.ShopManager;

public class InterfaceEx {

	/* 인터페이스
	 * -클래스 혹은 프로그램이 제공하는 기능을 명시적으로 선언하는 역할
	 * -추상 메서드와 상수로만 이루어짐
	 * -인터페이스를 이용하여 객체를 생성할 수 없음
	 * -인터페이스에서 변수를 선언하면 앞에 자동으로 public static final이 붙음
	 * -인터페이스에서 메서드를 선언하면 public abstract가 자동으로 붙음
	 * -implements 예약어 이용
	 */
	
	/* 인터페이스 구현과 형변환
	 * - 인터페이스를 이용하여 객체를 만들 수 없지만 인터페이스를 구현한 구현 클래스를 이용하여 객체를 만들 수 있음.
	 * 인터페이스명 객체명 = new 구현클래스();
	 */
	
	/*인터페이스 역할
	 * - 클라이언트 프로그램에 어떤 메서드를 제공하는지 미리 알려주는 명세 또는 약속의 역할
	 * - 인터페이스를 구현한 클래스가 어떤 기능의 메서드를 제공하는지 명시
	 */
	
	/* 인터페이스 상수
	 * - 인터페이스에서 선언한 변수를 컴파일하면 상수로 변환
	 * - 자동으로 public static final이 붙음.
	 */
	
	/* 디폴트 메서드
	 * - 자바 8이상부터 지원
	 * - 기본으로 제공되는 메서드
	 * - 인터페이스의 메서드이지만 구현부가 있는 메서드
	 * - default 키워드 이용
	 * - 나오게 된 배경
	 * 	- 기존에 만들어진 인터페이스에 새로운 메서드를 추가하게 되면 이전에 해당 인터페이스를 사용하던 구현 클래스들에 에러가 발생
	 * 	- 이러한 문제를 해결하기 위해 인터페이스에 뒤 늦게 기능이 추가되도 에러가 발생하지 않도록 하기 위해 디폴트 메서드 이용
	 */
	
	/* 정적 메서드
	 * - static을 붙임.
	 * - 메서드를 구현
	 * - 객체를 생성하지 않고도 호출할 수 있기 때문에 생성 가능
	 */
	
	/* 인터페이스 메서드
	 * -추상 메서드
	 * 	-구현부가 x
	 * 	-반드시 오버라이딩을 해야함
	 * -디폴트 메서드(default 키워드)
	 * 	-구현부가 o
	 * 	-오버라이딩해도 되고 안해도 됨
	 * -정적 메서드(static 키워드)
	 * 	-구현부가 o
	 * 	-인터페이스명을 통해 호출
	 */
	
	/* private 메서드
	 * - 자바 9부터 사용 가능
	 * - 구현 클래스에서 사용과 재정의가 불가능
	 * - 인터페이스에서 구현한 private 메서드를 같은 인터페이스에서 
	 * default메서드나 정적 메서드에서 호출해서 사용하여 재사용을 높임
	 */
	
	/* 인터페이스 상속
	 * - 인터페이스는 다중 상속이 가능
	 * - default 메서드가 없으면 문제 없음
	 * - 서로 다른 인터페이스에서 같은 이름의 default 메서드가 존재하면 반드시 자식 클래스에서 재정의 해야함.
	 */
	/* 상속과 구현
	 * - 클래스는 상속과 구현을 같이 받을 수 있다.
	 * class Child extends Parent implements InterfaceA{}
	 */
	
	public static void main(String[] args) {
		
		//인터페이스를 이용하여 객체를 생성할 수 없음
		//RunInterface run = new RunInterface();
			
		System.out.println(RunInterface.Num);
		Run run = new Run();
		run.run();
		run.load();
		//구현 클래스로 생성한 객체를 RunInterface가 관리
		RunInterface runInterface = new Run();
		runInterface.run();
		//RunInterface에는 load가 추상메서드로 존재하지 않기 때문에 에러가 발생
		//runInterface.load();
		//아래 코드는 Run클래스의 객체로 클래스변환이 됐기 때문에 load()메서드를 호출할 수 있음
		((Run)runInterface).load();
		run(new ShopManager());
		//run(new ShopManager());//단어장, 판매관리
		
	}
	
	/* 인터페이스 매개변수 다형성
	 * -매개변수를 인터페이스의 객채로 선언하면 호출할 때 매개변수로 구현 클래스들의 객체들이 올 수 있음
	 * => 다양한 클래스들의 객체가 올 수 있다
	 * -RunInterface의 객체를 매개변수로 하면, RunInterface를 구현한 구현 클래스인 Sho[manager, VocabularyNoteController의
	 * 객체가 와서 프로그램을 실행할 수 있다.
	 */

	public static void run(RunInterface program) {
		//프로그램 실행
		program.run();
	}
}

interface Stop{
	void stop();
}

//구현 클래스 : 인터페이스르 구현한 클래스
//구현 클래스는 인터페이스의 모든 추상 메서드를 반드시 오버라이딩해야함
//구현 클래스는 여러 인터페이스를 구현할 수 있다.
class Run implements RunInterface, Stop{
	
	public void load() {
		System.out.println("loading...");
	}

	@Override
	public void run() {
		System.out.println("program");
		stop();
	}

	@Override
	public void stop() {
		System.out.println("stop");
		
	}
	
}