package test.main;

import test.atuo.Engine;
import test.atuo.SportsCar;

public class MainClass09 {
	public static void main(String[] args) {
		// SportsCar객체를 생성해서 참조값을 car1변수에 담기
		SportsCar car1 = new SportsCar(new Engine());
		// 위에서 생성한 객체의 .drive(), openDrive() 메서드 각각 호출 
		car1.drive();
		car1.openDrive();
		
		SportsCar car2 = new SportsCar(null);
		car2.drive();
		car2.openDrive();
	}
}
