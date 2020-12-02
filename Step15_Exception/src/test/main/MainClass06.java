package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			//for문 안에서 1초씩 delay 시키는 예제
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}
