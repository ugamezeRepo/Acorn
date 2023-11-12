package Step10_Interface.tset.main;

import Step10_Interface.tset.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		// 인터페이스도 익명클래스 활용 가능
		Remocon r1 = new Remocon() {
			@Override
			public void up() {
				System.out.println("볼륨 올렷!");
			}
			
			@Override
			public void down() {
				System.out.println("볼륨 내렷!");
			}
		};
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			@Override
			public void up() {
				System.out.println("온도 올렷!");
			}
			@Override
			public void down() {
				System.out.println("온도 내렷!");
			}
		});
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
