package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		//타입이 제네릭클래스에 의해서 정해진다.
		FruitBox<Apple> box1=new FruitBox<Apple>();
		FruitBox<Banana> box2=new FruitBox<Banana>();
		FruitBox<Orange> box3=new FruitBox<>(); //<Orange> Orange 생략가능
		
		
		box1.item=new Apple();
		box1.setItem(new Apple());
		box1.getItem();
		
		box2.item=new Banana();
		box2.setItem(new Banana());
		box2.getItem();
		
		box3.item=new Orange();
		box3.setItem(new Orange());
		box3.getItem();
		
		
	}
}
