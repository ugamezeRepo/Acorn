package Step12_UtilClass.test.mypac;

public class Car {
	private String name;
	
	public Car (String name) {
		this.name = name;
	}
	
	public void drive() {
		System.out.printf("%s이(가) 달려요! %n", name);
	}
}
