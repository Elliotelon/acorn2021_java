package test.mart;

public class Computer {
	//필드
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	//디폴트 생성자
	public Computer() {}
	
	//생성자
	public Computer(Cpu cpu, Memory memory, HardDisk hardDisk) {
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
	}
	//메소드
	public void playGame() {
		System.out.println("게임을 해요!");
	}
	public void sendEmail(String addr) {
		System.out.println(addr+" 이라는 주소로 이메일을 보내요!");
	}

}
