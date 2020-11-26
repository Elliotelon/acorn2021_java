package test.mypac;

public class Zoo {
	//내부 클래스 type을 리턴하는 메소드
	public Monkey getMonkey() {
		return new Monkey();
	}
	
	//내부 클래스 type을 리턴하는 메소드
	public Cat getCat() {
		return new Cat();
	}
	
	//내부 클래스
	public class Monkey {
		public void Say() {
			System.out.println("안녕! 나는 원숭이야~");
		}
	}
	
	//내부 클래스
	public class Cat {
		public void Say() {
			System.out.println("안녕! 나는 고양이야~");
		}
	}
}
