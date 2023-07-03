package day24.thread;

public class ThreadEx3 {

	public static void main(String[] args) {
		Thread thread = new Thread(()->{
			for(int i = 0; i < 10; i++) {
				System.out.println("-");
			}
		});
		//thread.run //멀티 스레드가 아닌 싱글 스레드 main스레드
		thread.start();
		for(int i = 0; i < 10; i ++) {
			System.out.println("+");
		}
	}

}
