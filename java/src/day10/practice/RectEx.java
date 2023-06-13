package day10.practice;

public class RectEx {

	public static void main(String[] args) {
		// 그림판의 사각형을 그리기 위한 클래스를 생성하고 테스트 하는 코드를 작성하세요.
		/*
		Quad q1 = new Quad();
		q1.print();
		q1.area(5,7);
		q1.print();
		*/
		Rect1 r = new Rect1(0,0,10,10);
		r.print();
		r.move(10,10);
		r.print();
		r.resize(10, 10, 20, 20);
		r.print();
		r.resize(0, 0, 30, 30);
		r.print();
		
		System.out.println("R2 start!");
		Rect2 r2 = new Rect2(new Point(0,0), new Point(10,10));
		r2.print();
		r2.move(10,10);
		r2.print();
		r2.resize(10, 10, 20, 20);
		r2.print();
		r2.resize(0, 0, 30, 30);
		r2.print();
	}

}
class Rect1{
	//멤버변수
	/*
	 * 왼쪽 위의점 x좌표, 왼쪽 위의점 y좌표
	 * 오른쪽 아래의 점 x좌표, 오른쪽 아래 점 y좌표
	 */
	private int leftUpX, leftUpY;
	private int rightDownX, rightDownY;
	
	//생성자
	public Rect1(int leftUpX, int leftUpY, int rightDownX, int rightDownY) {
		this.leftUpX = leftUpX;
		this.leftUpY = leftUpY;
		this.rightDownX = rightDownX;
		this.rightDownY = rightDownY;
	}
	
	//메서드
	/**사각형 정보를 출력하는 메서드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 => void 
	 * 메서드명 : print
	 */
	public void print() {
		System.out.println("===============");
		System.out.println("LU point : " + leftUpX + " , " + leftUpY);
		System.out.println("RD point : " + rightDownX + " , " + rightDownY);
	}
	
	/**사각형을 이동시키는 메서드
	 * 매개변수 : 이동시킬 왼쪽 위의 점 => int x, int y
	 * 리턴타입 : 없음 = >void
	 * 메서드명 : move
	 */
	public void move(int x, int y) {
		int dx = leftUpX - x;//이동한 x좌표 거리
		int dy = leftUpY - y;//이동한 y좌표 거리
		leftUpX = x;
		leftUpY = y;
		rightDownX = rightDownX + x;
		rightDownY = rightDownY + y;
	}
	
	/**사각형의 크기를 변경하는 메서드
	 * 매개변수 : 변경된 사각형의 왼쪽 위의 x,y좌표와 가로, 세로가 주어지면 사각형의 크기를 변경하는 메서드
	 * 			=>int x, int y, int w, int h
	 * 리턴타입 : 없음 =>void
	 * 메서드명 : resize
	 */
	public void resize(int x, int y, int w, int h) {
		leftUpX = x;
		leftUpY = y;
		rightDownX = x + w;
		rightDownY = y + h;
	}
}

class Rect2{
	//멤버변수
	private Point leftUp, rightDown;

	public Rect2(Point leftUp, Point rightDown) {
		this.leftUp = leftUp;
		this.rightDown = rightDown;
	}
	public Rect2(int leftUpX, int leftUpY, int rightDownX, int rightDownY) {
		leftUp = new Point(leftUpX, leftUpY);
		rightDown = new Point(rightDownX, rightDownY);
	}
	
	/**사각형 정보를 출력하는 메서드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 => void 
	 * 메서드명 : print
	 */
	public void print() {
		System.out.println("===============");
		System.out.println("LU point : " );
		leftUp.print();
		System.out.println("RD point : " );
		rightDown.print();
	}
	
	/**사각형을 이동시키는 메서드
	 * 매개변수 : 이동시킬 왼쪽 위의 점 => int x, int y
	 * 리턴타입 : 없음 = >void
	 * 메서드명 : move
	 */
	public void move(int x, int y) {
		int dx = leftUp.getX() - x;//이동한 x좌표 거리
		int dy = leftUp.getY() - y;//이동한 y좌표 거리
		leftUp.move(x, y);
		rightDown.move(rightDown.getX() - dx, rightDown.getY() - dy);
	}
	
	/**사각형의 크기를 변경하는 메서드
	 * 매개변수 : 변경된 사각형의 왼쪽 위의 x,y좌표와 가로, 세로가 주어지면 사각형의 크기를 변경하는 메서드
	 * 			=>int x, int y, int w, int h
	 * 리턴타입 : 없음 =>void
	 * 메서드명 : resize
	 */
	public void resize(int x, int y, int w, int h) {
		leftUp.move(x, y);
		rightDown.move(x+w, y+h);
	}
}
/*class Quad{
	private int W, H, area;
	public Quad(){}
	public Quad(int W, int H) {
		this.W = W;
		this.H = H;
	}
	public void print() {
		System.out.println("width : " + W + ", " + "high : " + H);
		System.out.println("area : " + area);
	}
	public void area(int W, int H){
		this.W = W;
		this.H = H;
		area = W * H;
	}
}
*/