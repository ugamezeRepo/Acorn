package test.main;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		useNums();
		useNums(10);
		useNums(10, 20);
		useNums(10, 20, 30);
		
		useStrings();
		useStrings("kim", "lee", "park");
		
		useCars();
		useCars(new Car("소나타"));
		useCars(new Car("프라이드"), new Car("아반떼"));
	}
	
	// Integer type 여러 개를 전달받는 메서드
	public static void useNums(Integer... nums) { // nums: Integer[]
	}
	
	// String type 여러 개를 전달받는 메서드
	public static void useStrings(String... strs) { // strs: String[]
		
	}
	
	// Car type 여러 개를 전달받는 메서드
	public static void useCars(Car... cars) { // cars: Car[]
		
	}
}
