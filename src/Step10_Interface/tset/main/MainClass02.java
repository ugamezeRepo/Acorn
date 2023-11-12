package Step10_Interface.tset.main;

import Step10_Interface.tset.mypac.MyRemocon;
import Step10_Interface.tset.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		// 다형성 확인
		MyRemocon r1 = new MyRemocon();
		Remocon r2 = r1;
		Object r3 = r1;
		
		useRemocon(r1);
		useRemocon(r2);
		useRemocon((MyRemocon)r3);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
