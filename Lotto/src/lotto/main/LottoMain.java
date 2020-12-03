package lotto.main;

import lotto.mypac.Lotto;

public class LottoMain {
	public static void main(String[] args) {
		Lotto lot=new Lotto(45,6); //Lotto 생성자 호출
		lot.putNum(); //6개임의의 숫자 넣어주는 메소드 putNum() 호출
		lot.print(); //넣어준 6개의 숫자 콘솔창에 출력하는 메소드
		
		
	}
}
