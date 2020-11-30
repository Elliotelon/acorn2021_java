package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		//MemberDto 객체의 참조값을 담을수 있는 ArrayList 객체를 생성해서
		//ArrayList 객체의 참조값을 List type 지역변수 members 에 담기 
		List<MemberDto> members=new ArrayList<MemberDto>();
		//3명의 회원 정보를 members 배열에 담아 보세요.
		MemberDto mem1=new MemberDto();
		mem1.setNum(1);
		mem1.setName("김구라");
		mem1.setAddr("노량진");
		members.add(mem1);
		
		MemberDto mem2=new MemberDto(2, "해골", "행신동");
		members.add(mem2);
		
		members.add(new MemberDto(3, "원숭이", "상도동"));
		
		/*
		 *  members 에 들어 있는 참조값을 이용해서 
		 *  반복문 돌면서 아래와 같은 형식으로 회원 정보를 출력해 보세요.
		 *  
		 *  번호는 1 이름은 김구라 주소는 노량진
		 *  번호는 2 이름은 해골 주소는 행신동
		 *  번호는 3 이름은 원숭이 주소는 상도동
		 */
		
		for(int i=0; i<members.size(); i++) {
			String info="번호는 " + members.get(i).getNum()+
					" 이름은 "+members.get(i).getName()+
					" 주소는 "+members.get(i).getAddr();
			System.out.println(info);
		}
		System.out.println("--------------------------");
		for(int i=0; i<members.size(); i++) {
			MemberDto tmp=members.get(i);
			String info="번호는 " + tmp.getNum()+
					" 이름은 "+tmp.getName()+
					" 주소는 "+tmp.getAddr();
			System.out.println(info);
		
		}
		System.out.println("--------------------------");
		for(int i=0; i<members.size(); i++) {
			MemberDto tmp=members.get(i);
		}
		for(MemberDto tmp:members) {
			String info="번호는 " + tmp.getNum()+
					" 이름은 "+tmp.getName()+
					" 주소는 "+tmp.getAddr();
			System.out.println(info);
			
		}
		
	}
}