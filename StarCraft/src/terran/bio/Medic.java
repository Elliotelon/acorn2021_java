package terran.bio;

public class Medic {
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
		System.out.println("메딕이 이동하였습니다.");
	}
	
	public void healFi() {
		this.hp1+=3;
		System.out.println("파벳"+" hp : "+this.hp1+" mp : "+this.mp1+" sp : "+this.sp1
				+" 힐사용!! hp(+3)");
	}
	public void healGh() {
		this.hp2+=3;
		System.out.println("고스트"+" hp : "+this.hp2+" mp : "+this.mp2+" sp : "+this.sp2
				+" 힐사용!! hp(+3)");
	}
	public void healMa() {
		this.hp3+=3;
		System.out.println("마린"+" hp : "+this.hp3+" mp : "+this.mp3+" sp : "+this.sp3
				+" 힐사용!! hp(+3)");
	}
	
	public void die() {
		System.out.println("메딕이 죽었습니다.");
	}
		
}
