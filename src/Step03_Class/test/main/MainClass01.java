package Step03_Class.test.main;

// 다른 패키지의 클래스를 사용할 때 import를 한다.
import Step03_Class.test.mypac.Car;

@SuppressWarnings("unused")
public class MainClass01 {
	public static void main(String[] args) {
		// test.mypac.Car 클래스로 객체를 생성하고 생성된 객체의 참조값을 car1이라는 지역변수에 담기
		Car car1 = new Car();

		// method call
		car1.drive();
		// field에 저장된 값 참조( 불러오기)
		String name = car1.name;
//		// field에 값 대입하기
		car1.name = "소나타";
		// 대입한 이후에 필드에 저장된 값 참조( 불러오기)
		String name2 = car1.name;
	}
}
