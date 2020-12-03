package lotto.mypac;

import java.util.Arrays;

public class Lotto {
	private int[] lotto;
	private int num6,num45;
	//45개숫자(1~45) 중 6개 중복없이
	public Lotto(int num45, int num6) {
		this.num45=num45;
		this.num6=num6;
	
		lotto=new int[num6];//공간이 num6개인 배열 만들기
	}
	//1~45숫자 뽑는 메소드
	public int ranNum() {
		return (int)(Math.random()*num45)+1; 
	}
	//중복된 숫자 있는지 체크하는 메소드
		public boolean checkNum(int n) {
			boolean isCheck=false;
			for(int j=0; j<lotto.length; j++) {
				if(lotto[j]==n) {
					isCheck=true;
					break;
				}
			}
			return isCheck;
		}
	//숫자 넣어 주는 메소드
	public void putNum() {
		for(int i=0; i<lotto.length; i++) {
			int count=0;
			while(count!=num6) {
				int r=ranNum();
				if(!checkNum(r)) {
					lotto[count++]=r;
				}
			}
		}
	}
	//입력된 숫자 출력하는 메소드
	public void print() {
		for(int k=0; k<lotto.length; k++) {
			System.out.print(" "+lotto[k]); 
		}
	}
}

