package test.main;



import test.mypac.MyUtil;

public class MainClass03 {
	public static void main(String[] args) {
		//MyUtil 클래스에 정의된 static 메소드 호출하기
		MyUtil.playMusic();
		//MyUtil 클래스에 정의된 static 필드 참조하기 호출하기
		MyUtil.owner="김구라"; 
		System.out.println("hello!");
	
	}
}
