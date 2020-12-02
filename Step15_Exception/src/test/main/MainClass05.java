package test.main;
/*
 * Exception의 종류는 크게 두가지 이다.
 * 
 * 1. RuntimeException을 상속받아서 만든 실행중에 발생하는 Exception
 * 
 * 2. RuntimeException 을 상속받지 않아서 만든 컴파일(문법체크중) 중에 발생하는 Exception
 */
public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		try {
			//스레드(작업단위, Thread)를 5초 잡아두기
			//반드시 try~catch 블럭으로 예외처리를 해야한다.
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
