package Step07_Array.test.main;

import Step07_Array.test.mypac.*;

public class MainClass04 {
	public static void main(String[] args) {
		Bike[] bikes = new Bike[3];
		
		bikes[0] = new Bike();
		bikes[1] = new Bike();
		bikes[2] = new Bike();
		
		for (int i=0; i<bikes.length; i++) {
			Bike tmp = bikes[i];
			tmp.ride();
		}
		
		// 위 for문 대신 확장 for문을 사용하면 아래와 같다.
		for (Bike tmp:bikes) tmp.ride();
	}
}
