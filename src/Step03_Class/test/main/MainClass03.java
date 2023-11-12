package Step03_Class.test.main;

import Step03_Class.test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		// Car 객체를 생성했지만 사용하지 않고 버림
		new Car();

		// Car 객체를 생성해 1번 사용하고 버림(1회용)
		new Car().drive();

		// Car 객체를 생성해 참조값을 c1이라는 Car type 지역변수에 담고
		Car c1 = new Car();
		// 필요할 때마다 c1에 .을 찍어서 여러번 사용
		c1.drive();
		c1.drive();
		c1.drive();

		// c1.drive()의 리턴값은? void. 즉, 리턴 자체가 없다.
		// method를 만들 때, 리턴 타입을 미리 지정해준다. void main(), void drive() 등.
	}
}
