package Step04_Method.test.main;

import Step04_Method.test.mypac.Airplane;
import Step04_Method.test.mypac.Test;

public class MainClass02 {
	public static void main(String[] args) {
		Test t = new Test();
		t.doSomething(10, "lee", new Airplane());
		t.send();
		t.send(10);
		t.send("kim");
		t.send(new Airplane());
	}
}
