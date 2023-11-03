package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		FruitBox<Apple> box = new FruitBox<Apple>();
		FruitBox<Orange> box2 = new FruitBox<Orange>();
		FruitBox<Melon> box3 = new FruitBox<Melon>();
		
		// box와 box2에 .을 찍어서 차이점을 확인해보자
		box.pack(new Apple());
		box2.pack(new Orange());
		box3.unPack();
	}
}
