package tset.main;

import tset.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		Calc add1 = new Calc() {
			@Override
			public double execute(double num1, double num2) {
				return num1 + num2;
			}
		};
		double result = add1.execute(1, 2);
		
		// 매개변수의 타입 생략 가능. return이 있으면 1줄이라도 {} 생략 불가
		Calc add2 = (num1, num2) -> {return num1 + num2;};
		
		// 한 줄인 경우 {} 생략가능. lambda식으로 return을 생략하고 쓰거나 return을 하지 않는 경우만 해당.
		Calc add3 = (num1, num2) -> num1 + num2; // lambda식 
		
		Calc add = (a, b) -> a + b;
		Calc sub = (a, b) -> a - b;
		Calc mul = (a, b) -> a * b;
		
		double result2 = add.execute(10, 20);
		double result3 = sub.execute(100, 50);
		double result4 = mul.execute(3, 5);
		
		System.out.println("result1: " + result);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
		
	}
}
