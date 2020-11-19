package test.main;
/*
 *  6. 3항 연산자 테스트!
 * 
 * 
 */

public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait=false;
		
		//isWait이 트루이면 "기다려요", 거짓이면 "기다리지않아요"
		//둘중에 하나의 결과를 원할때 사용함.
		//1번
		String result=isWait? "기다려요" : "기다리지 않아요";
		System.out.println(result);
		
		//2번 (1번과 2번 같은 로직임)
		String result2=null;
		if(isWait) {
			result2="기다려요";
		}else {
			result2="기다리지 않아요";
		}
		System.out.println(result2);
		
		//10.12f이면 float이지만 생략되었으므로 double!
	    double	result3=isWait ? 10.12 : 99.5;
	}
}