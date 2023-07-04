package quiz.one;

public class Test6 {

	public static void main(String[] args) {
		int kor = 100, eng = 90, math = 34;
		//에러발생 실수를 정수현 변수에 저장하려고 했기 때문에(자동으로 형변환x)
		/*int*/
		double avg = (kor + eng + math)/3.0;
		System.out.println("avg = " + avg);

	}

}
