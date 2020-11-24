package test.mypac;

public class FruitBox<T> {
	//타입을 정하지 않은채로 클래스를 만드는 것.
	public T item;
	
	public void setItem(T item) {
		this.item=item;
	}
	
	public T getItem() {
		return this.item;
	}
	
	
	
	
}
