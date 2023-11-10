package test.main;

public class MainClass04 {
	// 이너클래스도 스태틱 영역에서 사용하려면 static을 붙여야 한다.
	public static class Gura { 
		public void say() {
			System.out.println("안녕! 나는 구라야!");
		}
	}
	
	public static void main(String[] args) {
		Gura g = new Gura();
		g.say();
	
		class Cat { // Local Inner Class
			public void say() {
				System.out.println("야옹");
			}
		}
		
		Cat c = new Cat();
		c.say();
	}
}
