package test.mypac;

//메소드를 하나만 정의 할 수 있도록 강제하는 어노테이션
@FunctionalInterface
public interface Calculator {
	//인자로 전달되는 두 숫자를 연산해서 결과 값을 리턴해주는 메소드
	public double exec(double a, double b);
}
