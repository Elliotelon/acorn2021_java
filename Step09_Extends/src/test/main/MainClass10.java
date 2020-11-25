package test.main;

import test.auto.Engine;
import test.mypac.SuperCar;

public class MainClass10 {
	public static void main(String[] args) {
		SuperCar car1=new SuperCar(new Engine());
		car1.drive();
		car1.driveFast();
		
		SuperCar car2=new SuperCar(null);
		car2.drive();
		car2.driveFast();
	}
}
