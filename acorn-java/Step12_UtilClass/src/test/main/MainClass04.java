package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		
		// 1. Car type을 저장하는 ArrayList객체를 생성하여 참조값을
		// List interface type의 cars에 대입
		List<Car> cars = new ArrayList<Car>();
		
		// 2. Car 객체 3개를 생성하여 List에 대입
		cars.add(new Car("VEYRON")); 
		cars.add(new Car("GENESIS")); 
		cars.add(new Car("HYUNDAI")); 
		
		// 3. 일반 for문으로 List 객체에 저장된 모든 Car객체의 drive() 메소드 호출
		System.out.println("=== 일반 for문 ===");
		for (int i=0; i<cars.size(); i++) {
			cars.get(i).drive();
		}
		
		// 4. 확장 for문으로 List 객체에 저장된 모든 Car객체의 drive() 메소드 호출
		System.out.println("=== 확장 for문 ===");
		for (Car tmp: cars) {
			tmp.drive();
		}
		
		// 5. Consumer interface를 활용해
		// List 객체에 저장된 모든 Car객체의 drive() 메소드 호출
		System.out.println("=== for each문 ===");
		cars.forEach(new Consumer<Car>() {
			@Override
			public void accept(Car t) {
				t.drive();
			}});
		
		cars.forEach(caca -> caca.drive());
	}
}
