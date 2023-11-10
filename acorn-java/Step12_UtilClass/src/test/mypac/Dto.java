package test.mypac;

public class Dto {
	int num;
	String name, title;
	
	public Dto() {
	}

	public Dto(int num, String name, String title) {
		super();
		this.num = num;
		this.name = name;
		this.title = title;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}	
}
