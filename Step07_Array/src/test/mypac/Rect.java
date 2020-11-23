package test.mypac;

public class Rect {
	//필드
	private int width; //폭을 저장할 필드
	private int height; //높이를 저장할 필드
	
	//생성자의 인자로 width와 height를 전달 받아서 필드에 저장하는
	//생성자를 정의해 보세요.
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	//필드에 저장된 width와 height를 이용해서 사각형의 넓이를 리턴하는 메소드를
	//정의해 보세요. 메소드명은 getArea()로 해서 만들어 보세요.
	public int getArea() {
		return this.width * this.height;
	}
	
}
