package terran.bio;

public class Marine {
	public int hp1=50;
	public int sp1=50;
	public int mp1;
	
	public int hp2=80;
	public int sp2=20;
	public int mp2=100;
	
	public int hp3=50;
	public int sp3=50;
	public int mp3;
	
	public int hp4=80;
	public int sp4;
	public int mp4=80;
	
	public void move() {
		System.out.println("마린이 이동하였습니다.");
	}
	
	public void attackFi() {
		this.hp1-=5;
		System.out.println("파벳"+" hp : "+this.hp1+" mp : "+this.mp1+" sp : "+this.sp1
				+" 공격당함!! hp(-5)");
	}
	public void attackGh() {
		this.hp2-=5;
		System.out.println("고스트"+" hp : "+this.hp2+" mp : "+this.mp2+" sp : "+this.sp2
				+" 공격당함!! hp(-5)");
	}
	public void attackMe() {
		this.hp4-=5;
		System.out.println("메딕"+" hp : "+this.hp4+" mp : "+this.mp4+" sp : "+this.sp4
				+" 공격당함!! hp(-5)");
	}
	
	public void die() {
		System.out.println("마린이 죽었습니다.");
	}
	
	public void steam() {
		this.hp3-=2;
		this.sp3+=10;
		System.out.println("마린"+" hp : "+this.hp3+" mp : "+this.mp3+" sp : "+this.sp3
				+" 스팀팩 사용!! hp(-2) sp(+10)");
	}

	
	
	
	
	
}
