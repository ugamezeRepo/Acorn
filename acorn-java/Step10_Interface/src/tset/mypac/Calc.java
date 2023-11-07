package tset.mypac;

// 추상메서드를 1개만 만들도록 강제하는 anno. (Arrow Func문법 보장)
@FunctionalInterface
public interface Calc {
	// 메서드로 두 개의 실수를 전달받아 어떤 연산 후 결과값을 리턴하는 메서드
	// 연산 기능은 개발자가 임의로 구현
	public double execute(double num1, double num2);
	// public void tmp(); // 함수형인터페이스 어노테이션이 붙으면 메서드 1개만
}
