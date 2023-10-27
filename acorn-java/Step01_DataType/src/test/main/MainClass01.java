package test.main;

@SuppressWarnings("unused")
/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명; // -128 ~ 127
 *  - short 변수명; // -32,768 ~ 32,767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; // 4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("mai 메서가 시작되었습니다.");
		// 정수형 변수 선언하고 값 대입하기.
		byte iByte = 10; // byte byte = 10; -> 예약어를 변수로 선언할 수 없으므로 에
		short iShort = 100;
		int iInt = 1000;
		long iLong = 10000;	
		
		int tmp = iShort; // int의 범위가 short의 범위보다 크므로 가능, 반대는 불가
		byte tmp2 = (byte)iShort; // 단, casting 연산자로 넣어줄 수 있다.
		
		// 실수형 변수 선언하고 값 대입하기.
		float num1 = 10.1f;
		double num2= 10.2d;
		double num3 = 10.3; // d,f를 붙이지 않으면 double type으로 간주
		
		// float type에 있는 값을 double type에 담기
		double tmp3 = num1;
		float tmp4 = (float)num2; // type casting 필
		
		System.out.println(tmp4);
		System.out.println("main 메서드가 종료됩니다.");
	}
}
