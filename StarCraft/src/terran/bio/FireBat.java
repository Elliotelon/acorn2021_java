package terran.bio;

public class FireBat {
	//체력(hp), 마나(mp), 공격속도(sp) 
	//파벳의 능력치
	private int hp1=50;
	private int sp1=50;
	private int mp1;
	
	//고스트의 능력치
	private int hp2=80;
	private int sp2=20;
	private int mp2=100;
	
	//마린의 능력치
	private int hp3=50;
	private int sp3=50;
	private int mp3;
	
	//메딕의 능력치
	private int hp4=80;
	private int sp4;
	private int mp4=80;
	
	public void move() {
		System.out.println("파벳이 이동하였습니다.");
	}
	
	public void attackMa() {
		this.hp3-=5;
		if(this.hp3<=0&&this.hp3>=-4) {
			System.out.println("마린이 죽었습니다.");
			
		}else if(this.hp3>0) {
			System.out.println("마린"+" hp : "+this.hp3+" mp : "+this.mp3+" sp : "+this.sp3
					+" 공격당함!! hp(-5)");
		}else {
			System.out.println("");
		}
	}
	public void attackGh() {
		this.hp2-=5;
		if(this.hp2<=0&&this.hp2>=-4) {
			System.out.println("고스트가 죽었습니다.");
			
		}else if(this.hp2>0) {
			System.out.println("고스트"+" hp : "+this.hp2+" mp : "+this.mp2+" sp : "+this.sp2
					+" 공격당함!! hp(-5)");
		}else {
			System.out.println("");
		}
	}
	public void attackMe() {
		this.hp4-=5;
		if(this.hp4<=0&&this.hp4>=-4) {
			System.out.println("메딕이 죽었습니다.");
			
		}else if(this.hp4>0) {
			System.out.println("메딕"+" hp : "+this.hp4+" mp : "+this.mp4+" sp : "+this.sp4
					+" 공격당함!! hp(-5)");
		}else {
			System.out.println("");
		}
	}
	
	public void die() {
		System.out.println("파벳이 죽었습니다.");
	}
	
	public void steam() {
		this.hp1-=2;
		this.sp1+=10;
		System.out.println("파벳"+" hp : "+this.hp1+" mp : "+this.mp1+" sp : "+this.sp1
				+" 스팀팩 사용!! hp(-2) sp(+10)");
	}

}
