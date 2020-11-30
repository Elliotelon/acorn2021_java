package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * 1. 3명의 회원 정보를 HashMap 객체를 3개 생성해서 각각 담아 보세요.
		 *    번호=> "num"  이라는 키값 으로 정수 저장
		 *    이름=> "name" 이라는 키값 으로 문자열 저장
		 *    주소=> "addr" 이라는 키값 으로 문자열 저장
		 * 	  
		 * 2. 위에서 생성한 Map을 담을 ArrayList 객체를 생성하고 생성된 참조값을
		 *    members 라는 이름의 지역변수에 담아보세요.
		 *
		 *3. members에 회원 정보가 담긴 Map 객체의 참조값을 순서대로 담아보세요.
		 *4. 반복문 돌면서 members에 담긴 내용을 아래와 같은 형식으로 출력해 보세요.
		 *
		 *번호 : 1, 이름 : 김구라, 주소 : 노량진
		 *.
		 *. 
		 *
		 */
		Map<String,Object> m1=new HashMap<>();
		Map<String,Object> m2=new HashMap<>();
		Map<String,Object> m3=new HashMap<>();
		
		m1.put("num", 1);
		m1.put("name", "김구라");
		m1.put("addr", "노량진");
		
		
		m2.put("num", 2);
		m2.put("name", "해골");
		m2.put("addr", "행신동");
	
		
		m3.put("num", 3);
		m3.put("name", "원숭이");
		m3.put("addr", "신림동");
	
		
		List<Map<String, Object>> members=new ArrayList<>();
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		for(Map<String, Object> tmp: members) {
			int num=(int)tmp.get("num");
			String name=(String)tmp.get("name");
			String addr=(String)tmp.get("addr");
			System.out.println("번호 : "+num+", 이름 : "+name+", 주소 : "+addr);
		}
	
	}
}
