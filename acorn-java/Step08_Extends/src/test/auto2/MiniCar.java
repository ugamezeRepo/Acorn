package test.auto2;

import test.auto.Car;
import test.auto.Engine;

public class MiniCar extends Car{
	public MiniCar(Engine engine) {
		super(engine);
	}
	
	public void openTrunk() {
		if(this.engine == null) {
			System.out.println("Engine이 없어서 달릴 수 없어요!");
		}
		System.out.println("트렁크를 열어요~");
	}
}
