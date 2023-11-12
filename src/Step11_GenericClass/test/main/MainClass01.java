package Step11_GenericClass.test.main;

import Step11_GenericClass.test.mypac.Apple;
import Step11_GenericClass.test.mypac.FruitBox;
import Step11_GenericClass.test.mypac.Melon;
import Step11_GenericClass.test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		// box와 box2에 .을 찍어서 차이점을 확인해보자
		FruitBox<Apple> box = new FruitBox<Apple>();
		FruitBox<Orange> box2 = new FruitBox<Orange>();
		
		// 객체 생성 시 Generic형은 생략 가능
		FruitBox<Melon> box3 = new FruitBox<>();
		box3.unPack();
		
		// Generic 클래스가 Apple로 되어있는 개체 사용
		box.pack(new Apple()); // Apple type을 매개변수에 전달
		Apple f1 = box.unPack(); // Apple type 리턴
		
		// Generic 클래스가 Orange로 되어있는 개체 사용
		box2.pack(new Orange()); // Orange type을 매개변수에 전달
		Apple f2 = box.unPack(); // Orange type 리턴
	}
}
