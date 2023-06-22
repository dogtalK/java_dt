package day17.interfaceex;

public interface RunInterface{
	/*public final static*/int Num = 10;//클래스 상수 => 클래스를 이용하여 호출
	/*public abstract*/ void run();
	default void stop() {
		System.out.println("program stop");
	}
}
