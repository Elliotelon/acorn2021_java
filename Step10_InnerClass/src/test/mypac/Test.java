package test.mypac;
/*
 * 클래스 안에 정의 할 수 있는 멤버?
 * 1.생성자
 * 2.필드
 * 3.메소드
 * 4.클래스
 */
public class Test {
	
	//클래스 안에 정의 하는 클래스는 Inner Class라고 한다.
	public class A{
		
	}
	public class B{
		
	}
	/*
	 * 메소드 안에 정의 할 수 있는 것?
	 * 
	 * 1.지역변수(local variable)
	 * 2.지역 내부 클래스(local inner class)
	 */
	
	public void test1() {
		class C{
			public void merong() {
				System.out.println("복잡하지롱~");
			}
		}
		C a=new C();
		a.merong();
	}
}
