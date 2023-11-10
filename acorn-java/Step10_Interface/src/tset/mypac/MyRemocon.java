package tset.mypac;

// Interface를 implements하면 인터페이스에 정의된 모든 추상 메서드를 오버라이드해야한다.

public class MyRemocon implements Remocon{
	@Override
	public void up() {
		System.out.println("채널 올렷!");
	}

	@Override
	public void down() {
		System.out.println("채널 내렷!");
	}
}
