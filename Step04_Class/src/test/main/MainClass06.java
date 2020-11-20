package test.main;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		//MemberDto 객체 생성해서 참조값을 dto1 이라는 이름의 지역변수에 담기
		MemberDto dto1=new MemberDto(1, "김구라", "노량진");
		MemberDto dto2=new MemberDto(2, "해골", "행신동");
		
		//dto1.num=1;
		dto1.setNum(1);
		
		//int num=dto1.num;
		int num=dto1.getNum();
		
		//dto1.name="이정호";
		dto1.setName("이정호");
		
		//String name=dto1.name;
		String name=dto1.getName();
		
		//dto1.addr="아현동";
		dto1.setAddr("아현동");
		
		//String addr=dto1.addr;
	    String addr=dto1.getAddr();
	}
}
