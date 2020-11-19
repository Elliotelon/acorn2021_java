package test.main;
/*
 *  4. 논리 연산자
 *  
 *  - 논리값 boolean 을 연산할때 사용하는 연산자이다.
 *  ||, &&, !
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// or 연산 
		boolean result1 = false || false; //false
		boolean result2 = false || true; //true
		boolean result3 = true || false; //true
		boolean result4 = true || true; //true
		// and 연산
		boolean result5 = false && false; //false
		boolean result6 = false && true; //false
		boolean result7 = true && false; //false
		boolean result8 = true && true; //true
		// not 연산
		boolean result9 = !true; //false
		boolean result19 = !false; //true
		//만일 isRun이 true가 아니라면
		boolean isRun=false;
		if(isRun != true){
			System.out.println("달리지 않아요");
		}
		//만일 달리지 않을거라면		
		if(!isRun){
			System.out.println("달리지 않아요2");
		}
	}
}
