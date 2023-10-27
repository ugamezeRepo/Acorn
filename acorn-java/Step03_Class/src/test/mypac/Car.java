package test.mypac;

/*
 *  class 의 역할
 *  
 *  1. 객체의 설계도 역할
 *    - 객체는 heap영역(사물함)에 들어있는 물건이라고 생각하면 된다. 
 *    - class를 이용해서 객체를 원하는 시점에 원하는 갯수 만큼 만들어 낼 수 있다.
 *    - 만들어진 객체가 어떤 저장소와 어떤 기능을 가지게할 지 class로 설계 할 수 있다.
 *    
 *  2. data type 역할
 *  
 *  3. static 필드와 메소드를 포함하는 역할
 */
public class Car {
	// 저장소( field)
	public String name; // 선언만 할 경우 초기값 null
	public int price; // 선언만 할 경우 초기값 0

	// 기능( method)
	public void drive() {
		// this는 바로 이 객체의 참조값을 가리키는 예약어이다.
		System.out.println(this.name + " 달려요!");
	}
}