package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		/*  1. 문자열을 저장할수 있는 ArrayList 객체를 생성하고
		 *  2. Scanner 객체를 이용해서 친구 이름을 반복문 돌면서 5개 입력 받아서 
		 *     위에서 생성한 ArrayList 객체에 순서대로 저장을 하세요.
		 *  3. ArrayList 객체에 저장된 내용을 반복문 돌면서 순서대로 아래와 같은 형식으로 
		 *     콘솔창에 출력해 보세요.
		 *     
		 *  0 번째 친구 이름 : 김구라
		 *  1 번째 친구 이름 : 해골
		 *  2 번째 친구 이름 : 원숭이
		 *  3  .
		 *  4  .
		 */
		//여러개의 문자열의 참조값을 저장하기 위해 생성한 객체
		List<String> names=new ArrayList<String>();
		//키보드로 부터 문자열을 입력 받기 위해 생성한 객체 (금수저)
		Scanner scan=new Scanner(System.in);
		//5 번 반복을 수행할 for 문 구성
		for(int i=0; i<5 ; i++) {
			System.out.println("친구 이름 입력:");
			String line=scan.nextLine();
			names.add(line);
		}
		//반복문 돌면서 names  에 저장된 내용을 정해진 형식으로 콘솔창에 출력하기
		for(int i=0; i<5; i++) {
			//i 번째 저장된 아이템을 읽어와서 
			String tmp=names.get(i);
			System.out.println(i+" 번째 친구 이름 : "+tmp);
		}
		System.out.println("----------------");
		for(String tmp:names) {
			System.out.println("친구 이름 : "+tmp);
		}
	}
}
