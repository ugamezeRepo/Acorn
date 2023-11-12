package Step06_WrapperClass.test.main;

@SuppressWarnings("unused")
public class MainClass02 {
	public static void main(String[] args) {
		// 기본형
		double num1 = 10.1;
		// 참조형
		Double num2 = 10.2;
		
		// 참조형 Double이지만 기본형처럼 사용할 수 있다.
		double result1 = num2 + 10;
		double result2 = num1 + num2;
		double result3 = num1 + num2;
		
		// 문자열을 숫자(double)로 바꾸기 "10.3" -> 10.3
		double result4 = Double.parseDouble("10.3");
	}
}
