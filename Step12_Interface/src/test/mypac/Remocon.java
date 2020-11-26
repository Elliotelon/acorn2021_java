package test.mypac;
/*
 * [interface]
 * 
 * -생성자가 없다(단독 객체 생성 불가)
 * -구현된 메소드는 가질 수 없다.(추상 메소드만 가능)
 * -필드는 static final 상수만 가질 수 있다.
 * -data type의 역할을 할 수 있다.
 * -interface type의 참조값이 필요하다면 구현(implements) 클래스를 이용해서
 *  객체 생성을 해야한다.
 *  -클래스는 단일 상속(extends)이지만 인터페이스는 다중 구현(implements)가 가능하다.
 * 
 * 
 */

public interface Remocon {
	//필드 (final 예약어가 필드나 지역변수에 붙으면 값 수정 불가)
	//final 필드나 지역변수의 이름은 관례상 모두 대문자로 지정한다.
	//static final은 생략 가능하다(생략해도 자동으로 static final이 된다.)
	public static final String COMPANY="LG";
	public static final String[] A= {"1","2","3","4"};
	
	//메소드 (추상 메소드만 가능하다)
	public abstract void up();
	
	//abstract 생략 가능
	public void down();
	
	
	
}





