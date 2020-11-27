package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass04 {
	public static void main(String[] args) {
		//정수를 저장할 ArrayList 객체를 생성해서 참조값을 nums 라는 지역변수에 담아보세요.
		List<Integer> nums=new ArrayList<>();
		nums.add(new Integer(10));
		nums.add(20);
		nums.add(30);
		
		//실수를 저장할 ArrayList 객체를 생성해서 참조값을 nums2 라는 지역변수에 담아보세요.
		List<Float> nums2=new ArrayList<>();
		nums2.add(1.1f);
		nums2.add(1.5f);
		nums2.add(3.934f);
		
		Map<String, Object> m1=new HashMap<>();
		List<Map<String, Object>> Li1=new ArrayList<>();
		
		m1.put("name", "김구라");
		m1.put("num",1);
		m1.put("addr", "노량진");
		Li1.add(m1);
		
		
		
		
		
	
	
	}
}
