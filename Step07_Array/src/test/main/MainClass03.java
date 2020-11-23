package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		String[] names= {"김구라", "해골", "원숭이", "주뎅이", "덩어리"};
		//names 배열에 저장된 문자열을 순서대로 콘솔창에 출력하기
		for(int i=0; i<names.length; i++) {
			String s=names[i];
			System.out.println(s);
		}
	}
}
