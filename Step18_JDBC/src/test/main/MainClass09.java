package test.main;

import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		// 850번 회원의 정보를 삭제하고자 한다.
		
		//이미 만들어진 클래스로 객체를 생성해서
		MemberDao dao=new MemberDao();
		//메소드를 사용하는 사용자 입장이다.
		boolean isSuccess=dao.delete(807);
		//위 작업의 성공 여부를 알수가 없다.
		//자~ 이제 여러분은 어떻게 할 것인가?
		//위의 클래스는 여러분의 상사인 대리가 설계해서 만들었다고 가정하자
		
		if(isSuccess) {
			System.out.println("삭제 성공!");
		}else {
			System.out.println("삭제 실패!");
		}
		
		MemberDto dto1=new MemberDto();
		dto1.setAddr("서울");
		dto1.setName("kim");
		dto1.setNum(808);
		boolean isSuccess2=dao.update(dto1);
		if(isSuccess2) {
			System.out.println("수정 성공!");
		}else {
			System.out.println("수정 실패!");
		}
		
		
			MemberDto dto2=new MemberDto();
			dto2.setName("Kim3");
			dto2.setAddr("NewYork");
			boolean isSuccess3=dao.insert(dto2);
			
			if(isSuccess3) {
				System.out.println("추가 성공!");
			}else {
				System.out.println("추가 실패!");
			}
		
		MemberDto isSuccess4=dao.select(12);
		if(isSuccess4!=null) {
			System.out.println("한명의정보 선택 성공! "+"num : "+isSuccess4.getNum()+
					", name : "+isSuccess4.getName()+", addr : "+isSuccess4.getAddr());
		}else {
			System.out.println("한명의정보 선택 실패!");
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
