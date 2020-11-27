package test.main;

import test.mypac.Drill;

public class MainClass05 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole(int a) {
				System.out.println(a);
				System.out.println("바닥에 구멍을 3개 뚫어요");
			}
		});
		
		//위와 같음 Drill의 메소드가 하나인 경우에만 줄여서 사용가능함.
		useDrill((int a)->{
			System.out.println(a*a);
			System.out.println("바닥에 구멍을 3개 뚫어요");
		});
		
		Drill d1=(int a)->{
			System.out.println(a-a);
			System.out.println("아무데나 구멍을 뚫어요");
		};
		useDrill(d1);
		
	}
	
	public static void useDrill(Drill d) {
		d.hole(5);
	}
}
