package day9.classex;

import java.util.Scanner;

public class StudentScoreManager {
	
	/* 추상화
	 * 현실에 있는 정보를 클래스로 만드는 것을 추상화라고 한다
	 * - 학생이라는 현실의 정보를 Student라는 클래스로 만드는 것
	 */
	/* 현실에 있는 정보	=> 클래스
	 * 프로그램을 통해 현실에 있는 정보를 관리하기 위해서
	 * 고등학생 성적 관리 프로그램
	 * 학생 정보 		=> 	Student
	 * 이름(o)		=>	 String name
	 * 주민번호(o)		=>	 StringresidentNumber
	 * 학년(o)		=>	 int grade
	 * 반(o)			=>	 int classNum
	 * 번호(o)		=>	 int number
	 * 나이(x)		=>	
	 * 생일(x)		=>	
	 * 가족관계(x)		=>	
	 * 주소(x)		=>	
	 * 년도(o)		=> 	int admissionYear
	 * 1학년 1학기 국어성적 	Score korScore, engScore, mathScore;
	 * 1학년 2학기 국어성적
	 * 1학년 1학기 수학성적
	 * 등...
	 * 
	 * 성적			=>	Score
	 * 과목명			=>	Sting tilte
	 * 학년			=>	int grade
	 * 학기			=>	int semester
	 * 총점수			=>	double total
	 * 중간			=>	double mid
	 * 기말			=>	double final
	 * 수행평가		=>	double performance
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sc.close();
		//korScore를 인스턴스, 객체 라고 부른다.
		//Score1 korScore = new Score1(1,2,"korean Language");
		Score1 korScore = new Score1();
		korScore.title = "korean Language";
		korScore.grade = 1;
		korScore.semester = 2;
		Score1 engScore = new Score1(1, 2, "English");
	}

}

//성적 클래스
class Score1{
	String title;//과목명
	int grade;//학년
	int semester;//학기
	double total;//총점수
	double midExam;//중간고사
	double finalExam;//기말고사
	double performance;//수행평가
	//Score1 클래스의 기본 생성자
	public Score1() {
		/* title의 기본값은? null
		 * grade의 기본값은? 0
		 * total의 기본값은? 0.0
		 */
		title = "";
		grade = 1;
		semester = 1;
	}
	public Score1(int _grade,int _semester, String _title) {
		grade = _grade;
		semester = _semester;
		title = _title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getMidExam() {
		return midExam;
	}
	public void setMidExam(double midExam) {
		this.midExam = midExam;
	}
	public double getFinalExam() {
		return finalExam;
	}
	public void setFinalExam(double finalExam) {
		this.finalExam = finalExam;
	}
	public double getPerformance() {
		return performance;
	}
	public void setPerformance(double performance) {
		this.performance = performance;
	}
	public Score1(String title, int grade, int semester, double total, double midExam, double finalExam,
			double performance) {
		this.title = title;
		this.grade = grade;
		this.semester = semester;
		this.total = total;
		this.midExam = midExam;
		this.finalExam = finalExam;
		this.performance = performance;
	}
	
}

//학생 클래스
class Student1{
	String name;//이름
	String residentNumber;//주민번호
	int grade;//학년
	int classNum;//반
	int number;//번호
	int admissionYear;//입학년도
	Score1 korScore, engScore, mathScore; //국어, 영어, 수학 성적
	
	/*스택 메모리 vs 힙 메모리
	 * 스택
	 * -메서드 호출과 관련되 정보를 저장하는 영역
	 * -메서드 호출 시 매개변수, 지역변수, 복귀 주소 등이 저장
	 * 힙
	 * -동적으로 할당된 객체들이 저장되는 영역(new 키워드)
	 * -확장 축소 가능
	 * -사용되지 않는 객체는 GC(가비지 컬렉터)에 의해 제거
	 * -객체의 인스턴스 변수, 배열 등
	 */
	/* 생성자
	 * 인스턴스(객체)의 멤버변수나 상수를 초기화 하는 것
	 * 메서드와 비슷하게 생김
	 * -이름이 클래스 이름과 같다
	 * -메서드와 비교했을 때 리턴타입이 없음. => void 아니고 생략
	 * 디폴트 생성자(기본 생성자)
	 * -매개변수가 없는 생성자
	 * -클래스의 생성자가 하나도 없을 때 자동으로 생성
	 * -기본 생성자가 없는 경우도 있음(예: Scanner)
	 */
}