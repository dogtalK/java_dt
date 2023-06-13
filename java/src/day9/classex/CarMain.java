package day9.classex;

public class CarMain {
	
	/* Car				//자동차
	 * String name;		//차명
	 * String company;	//제조사
	 * int year;		//연식
	 * int speed;		//속력
	 * char gear;		//P:주차, R: 후진, D: 주행, N:중립
	 * boolean power;	//전원
	 */
	public static void main(String[] args) {
		/* 현대 뉴 아반떼 2023년식 자동차 객체를 생성하는 코드를 작성하세요*/
		
		Car myCar = new Car("The new avante", "Hyundai", 2023);
		//현재 내 차 정보를 조회
		myCar.turn();
		myCar.setGear('D');
		myCar.printInfo();
		myCar.speedChange(false);
		myCar.printInfo();
		myCar.speedChange(true);
		myCar.speedChange(true);
		myCar.speedChange(true);
		myCar.printInfo();
		myCar.speedChange(false);
		myCar.printInfo();
		
	}

	/*생성자
	 * 인스턴스()객체)의 멤버변수나 상수를 초기화 하는 것
	 * 편리=> 멤버를 한번에 쉽게 초기화 할 수 있어서
	 * 메서드와 비슷하게 생김
	 * -이름이 클래스 이름과 같다
	 * -메서드와 비교했을 때 리턴 타입이 없음 =>void가 아니고 생략
	 * 디폴트 생성자(기본 생성자)
	 * -매개변수가 없는 생성자
	 * -클래스의 생성자가 하나도 없을 때 자동으로 추가
	 * -기본 생성자가 없는 경우도 있음
	 */
	/*생성자 오버로드
	 * 여러 종류의 생성자를 만들 수 있다
	 * 클래스에 생성자가 2개 이상인 경우
	 * 다양한 경우를 대비해서 초기화하기 위해
	 */
	/*멤버변수와 메서드 호출
	 * 객체명.멤버변수 = 값; //대체로 특별한 경우만 사용
	 * 객체명.메서드명(매개변수들);
	 */
	/*정보은닉
	 * 클래스내부에 사용할 변수나 메서드를 private으로 선언해서 외부에서 접근하지 못하도록 막는것
	 * 일반적으로 멤버변수는 private
	 * 일반적으로 메서드는 public
	 * 클래식변수 public, 싱글톤 private
	 */
	
}
