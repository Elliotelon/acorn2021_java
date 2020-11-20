package test.mypac;
/*
 *  static 자원을 포함하는 용도로 사용해 보기
 */
public class MyUtil {
	//non static 필드
	public int version;
	
	//static 필드
	public static String owner;
	
	public static void playMusic() {
		System.out.println("음악을 틀어요!");
		//static 안에서 non static 참조 불가.
		//int a=this.version;
		//int b=MyUtil.version;
		
		String c=MyUtil.owner;
	}
}
