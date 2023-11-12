package Step09_AbstractClass.test.main;

import Step09_AbstractClass.test.mypac.Car;

public class MainClass07 {
	static class MyCar extends Car {
		@Override
		public void drive() {
			System.out.println("MyCar는 더 빨리 달려요~");
		}
	}
	
	public static void main(String[] args) {
		useCar(new Car()); // 부모클래스
		
		useCar(new MyCar()); // 자식클래스
		
		useCar(new Car() { // 익명클래스
			public void drive() {
				System.out.println("졸라 빨리 달려요~");
			}
		});
		
		
	}
	
	public static void useCar(Car car) {
		car.drive();
		car.drive();
	}
}
