package Step11_GenericClass.test.mypac;

public class FruitBox<T> {
	// 필드
	private T item;
	
	// 과일을 포장하는 메서드
	public void pack(T item) {
		this.item = item;
	}
	
	// 과일을 언박싱하는 메서드
	public T unPack() {
		return item;
	}
}
