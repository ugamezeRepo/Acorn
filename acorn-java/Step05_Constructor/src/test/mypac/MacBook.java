package test.mypac;

public class MacBook {
	// 외부에서 접근이 불가하도록 접근 지정자 private로 필드 3개 선언
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	// 생성자
	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		// 생성자의 매개변수로 전달되는 값을 필드에 저장하기
		this.cpu = cpu;
		this.memory = memory;
		this.hardDisk = hardDisk;
	}
	
	void print() {
		System.out.println("cpu: " + cpu + " memory: " + memory +" hardDisk: " + hardDisk);
	}
}
