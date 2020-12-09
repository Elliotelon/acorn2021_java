package test.main;

import java.util.List;

import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * 추가할 회원의 정보가 아래와 같을때 아래 회원의 정보를 
		 * member 테이블에 추가하려면?
		 * 
		 */
		String name="섯거라";
		String addr="신길동";
		
		//추가할 회원의 정보를 MemberDto 객체에 담는다.
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		MemberDao dao=new MemberDao();
		boolean isSuccess=dao.insert(dto);
		
		if(isSuccess) {
			System.out.println("추가 성공!");
		}else {
			System.out.println("추가 실패!");
		}
	
	}
}
