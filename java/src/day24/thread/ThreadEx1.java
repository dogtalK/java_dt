package day24.thread;

public class ThreadEx1 {

	public static void main(String[] args) {
		ChildThread1 chThread = new ChildThread1();
		chThread.start();
		for(int i = 0; i<10; i++) {
			System.out.println("Work1");
		}
	}

}

class ChildThread1 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("Work2");
		}
	}
}