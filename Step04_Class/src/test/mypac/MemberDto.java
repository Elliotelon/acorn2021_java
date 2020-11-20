package test.mypac;
/*
 * 클래스 안에 정의 할 수 있는것
 * 1.필드 2.메소드 3.생성자
 * 
 */

public class MemberDto {
	public int num;
	public String name;
	public String addr;
	
	// 객체를 new 할때 호출되는 생성자
	// 메소드가 아님
	// 생성자(Constructor) 임
	// 생성자의 특징은 리턴 type (void) 가 없고 클래스명과 동일하게 작성해야 한다.
	public MemberDto(int num, String name, String addr) {//클래스명 똑같이
		this.num=num;
		this.name=name;
		this.addr=addr;
		
	}
}
