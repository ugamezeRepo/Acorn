package tset.mypac;

/**
 *  [ Interface ] 
 *  - 생성자가 없다. (단독 객체 생성 불가)
 *  - 구현된 메서드는 가질 수 없다. (추상 메서드만 가능)
 *  - 필드는 static final 상수만 가질 수 있다.
 *  - 자료형의 역할을 할 수 있다.
 *  - 인터페이스형의 참조값이 필요하면 구현(implements) 클래스를 만들어서 객체를 생성해야한다.
 *  - 클래스 상속은 단일 상속이지만, 인터페이스는 다중 구현이 가능하다.
 */

public interface Remocon {
	// 필드는 static final 필드만 가질 수 있다. (static final은 생략 가능)
	public String COMPANY = "LG";
	public void up();
	public void down();
}
