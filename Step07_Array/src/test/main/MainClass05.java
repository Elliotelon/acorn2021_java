package test.main;

import test.mypac.Car;

public class MainClass05 {
	public static void main(String[] args) {
		//1.Car type을 담을 수 있는 방3개짜리 배열객체를 생성한다음
		//참조값을 cars라는 지역변수에 담아보세요.
		Car[] cars=new Car[3];
		
		//2.cars 배열에 Car객체를 생성해서 순서대로 담아보세요 (총3개)
		cars[0]=new Car();
		cars[1]=new Car();
		cars[2]=new Car(); //for(int i=0; i<cars.length; i++){
						   //cars[i]=new Car();}
		
		//3.cars 배열에 저장된 Car객체의 참조값을 순서대로 참조해서 
		//.drive() 메소드를 호출해 보세요 (저는 콘솔창에 무언가 출력하라고 하지 않았습니다.)
		cars[0].drive();
		cars[1].drive();
		cars[2].drive(); //for(int i=0; i<cars.length; i++){
		   				//cars[i].drive();}
		
	}
}
