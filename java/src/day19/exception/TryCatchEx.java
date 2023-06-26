package day19.exception;

public class TryCatchEx {

	public static void main(String[] args) {
		/*catch는 최소 1개는 필요
		 * 어떤 예외가 발생할지 모를 떄에는 Exception을 이용
		 */
		
		try {
			//예외가 발생할 수 있는 코드
			System.out.println(1 / 0);//ArithmeticException이 발생
		}catch(ArithmeticException e) {
			System.out.println("BBBBBB");
		}
		//첫번쩨 catch로 가서 ArithmeticException 클래스의 객체를 Exception으로 변환 가능한지 확인하고
		//가능하면 처리
		catch(Exception e) {
			//예외처리
			System.out.println("AAAAAA");
		}
		//위에 Exception에서 모든 예외가 걸리기 때문에 아래있는 catch를 실행할 일이 없음
		/*catch(ArithmeticException e) {
			System.out.println("BBBBBB");
		}*/
		System.out.println("program exit");
	}

}
