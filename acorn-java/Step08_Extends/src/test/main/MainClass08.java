package test.main;

import test.auto.*;

public class MainClass08 {
	public static void main(String[] args) {
		// Car객체를 생성해서 참조값을 car1이라는 지역변수에 담기
		Car car1 = new Car(new Engine());
		// car1에 .찍어서 drive() 메소드 호출
		car1.drive();
		
		Car car2 = new Car(null);
		car2.drive();
	}
}
