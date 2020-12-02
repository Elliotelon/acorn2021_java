package test.main;

import test.mypac.MyUtil;

public class MainClass08 {
	public static void main(String[] args) {
		//MyUtil 클래스의 static 메소드 사용해 보기
		MyUtil.draw();
		try {
			MyUtil.send();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
