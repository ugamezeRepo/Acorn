package test.main;

import test.mypac.Car;

@SuppressWarnings("unused")
public class MainClass02 {
	public static void main(String[] args) {
		// Car class로 객체를 생성해서 참조값을 car1이라는 Car type 지역변수에 담기.
		Car car1 = new Car();
		// Car class로 객체를 생성해서 참조값을 car2라는 Car type 지역변수에 담기.
		Car car2 = new Car();

		// field에 String type의 참조값 대입하기
		car1.name = "소나타";
		car2.name = "그랜저";

		// method 호출하기
		car1.drive();
		car2.drive();

		boolean result = car1 == car2; // false. 다른 객체, 다른 참조값을 가지고있다.

		Car car3 = car2;
		car3.drive(); // car2.drive()와 동일한 기능을 수행한다.
		boolean result2 = car3 == car2; // true. 같은 객체, 같은 참조값을 가지고있다.
	}
}
