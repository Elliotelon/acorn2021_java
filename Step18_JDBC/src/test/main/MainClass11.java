package test.main;

import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MainClass11 {
	public static void main(String[] args) {
		/*
		 * 아래는 member 테이블에 저장된 회원의 번호라고 가정하자 
		 * 
		 * 그런데 저 번호의 회원이 존재하는지는 확실치 않다.
		 * 
		 * 만일 존재한다면 해당회원의 정보를 콘솔창에 출력하고
		 * 
		 * 존재하지 않는다면 해당회원은 존재하지 않는다고 콘솔창에
		 * 
		 * 출력하는 프로그래밍을 해보세요
		 * 
		 * 단)MemberDao 객체를 활용해서
		 */
		int num=808;
		//MemberDao 객체를 생성해서
		MemberDao dao=new MemberDao();
		//select() 메소드를 이용해서 회원 한명의 정보를 받아온다.
		MemberDto dto=dao.select(num);
		
		if(dto==null) {
			System.out.println(num+" 번 회원은 존재하지 않습니다.");
		}else {
			System.out.println("num : "+dto.getNum()+", name : "+dto.getName()
					+", addr : "+dto.getAddr()); 
		}
		
		
		
	}
}
