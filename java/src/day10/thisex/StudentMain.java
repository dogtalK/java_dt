package day10.thisex;

public class StudentMain {
	/*this
	 * 생성된 인스턴스 스스로를 가르키는 예약어
	 * 자신의 주소를 반환한다
	 * 주로 생성자나 메서드에서 멤버변수와 매개변수를 구분할 때 사용
	 * -멤버변수와 매개변수 명이 같은 경우 사용(반드시 this를 사용)
	 */
	/*this()
	 * 생성자가 ㅇ러개인 경우 다른 생성자를 호출할 때 사용
	 * 다른 생성자 호출 시 첫 라인에 써야하며 다른 라인에 쓰면 에러 발생
	 * this() 사용 시 무한 루프에 빠지지 않도록 조심해서 사용
	 */
	/*static 변수
	 * 하나의 클래스로 만든 모든 객체가 공통적인 값을 가지는 속성이 있는 경우 static을 붙임
	 * 프로그램이 실행되어 메모리에 올라 갔을때 한번 메모리 공간이 할당
	 * 클래스 변수라고도 함
	 * 접근제어가 static 자료형 변수명
	 */
	/*static 메서드
	 * 클래스 메서드라고도 함
	 * 객체 생성 없이 호출 가능
	 * 호출 방법 
	 * 클래스명.메서드명(매개변수);
	 * 예:
	 * Math.sqrt();//대표적인 클래스 메서드
	 * Math 클래스에 있는 대부분 메서드가 static
	 */
	/*클래스 메서드 vs 객체 메서드
	 * 클래스 메서드 안네서
	 * -클래스 변수를 사용할 수 있다
	 * -객체 변수를 직접 사용할 수 없다(객체 생성 후는 가능)
	 * -객체 메서드 직접 호출할 수 없다(객체 생성 후는 가능)
	 * 객체 메서드 안에서
	 * -클래스 변수를 사용할 수 있다
	 * -객체 변수를 사용할 수 있다.
	 * -클래스 메서드 직접 호출할 수 있다.
	 */
	public static void main(String[] args) {
		Student1.printCount();
		
		Student1 std1 = new Student1(1,1,1,"hong");
		Student1.printCount();
		
		Student1 std2 = new Student1(1,1,2,"lim");
		Student1.printCount();
		
		//std2.studentCount = 1;
		//System.out.println(std1.studentCount);
		std1.print();
		//Student1.print();//에러 발생. static이 print에는 안붙어서 
		std2.print();
	}

}
class Student1{
	static int studentCount;
	private int grade, classNum, number;
	private String name;
	//아래 생성자는 매개변수가 있고, 매개변수의 이름이 멤버변수와 같이 때문에
	//멤버 변수를 호출할 때 this를 반드시 붙여야함.
	public Student1(int grade, int classNum, int number, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		this.name = name;
	}
	//기본 생성자는 매개변수가 없기 때문에 this를 안써도 됨.
	public Student1(){
		//멤버변수와 이름이 같은 지졍ㄱ 변수를 만들수도 있가(비추천)
		//int grade = 10;
		//this.grade = grade;
		this(1,1,1,"");
		name = "";
		/*
		this.grade = 1;
		classNum = 1;
		number = 1;
		name = "";
		*/
	}
	
	public void print() {
		System.out.println("==================");
		System.out.println("grade    : " + grade);
		System.out.println("classNum : " + classNum);
		System.out.println("number   : " + number);
		System.out.println("name     : " + name);
		//클래스 변수 사용 가능
		//System.out.println("count    : " + studentCount);
		//클래스 메서드 사용 가능
		//printCount();
	}
	//클래스 메서드
	public static void printCount(){
		//클래스 변수 사용 가능
		System.out.println("Registered student count : " + studentCount);
		//객체 변수 직접 사용 불가능
		//grade = 1;
		//객체 메서드 직접 사용 불가능
		//print();
		//객체를 생성 후 호출해서 사용 가능
		Student1 std1 = new Student1();
		std1.name = "hong";
		std1.print();
	}
	/*변수 유효범위
	 * 지역변수
	 * -메서드에 선언된 변수
	 * -선언된({}안)에서 사용 가능. 벗어나면 사용 불가능
	 * -스택에 생성
	 * -메소드 반환 시 메모리 공간이 해제 되면서 없어짐
	 * 멤버변수
	 * -객체변수(인스턴스 변수)
	 * -힙에 생성
	 * -객체가 GC에 의해 수거될 대 해제 됨
	 * -클래스 안에 있는 모든 객체 메서드
	 * 클래스 변수
	 * -프로그램 영역 중 데이터 영역(상수, 문자열, 클래스변수)에 생성
	 * -프로그램이 종료될 때 해제
	 * static 변수를 너무 크게 잡지 말자
	 */
	/*싱글콘
	 * 인스턴스를 단 하나만 생성하는 디자인 패턴을 싱글톤 패턴이라고 함
	 * 1. 생성자를 private으로
	 * 2. 클래스 변수를 이용하여 인스턴스 생성
	 * 3. 2번에 만든 객체를 외부에서 참조할 수 있는 public 메서드 생성
	 * 4. 사용하기
	 */
}