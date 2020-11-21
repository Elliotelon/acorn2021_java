package terran.bio;

public class Medic {
	private int hp1=50;
	private int sp1=50;
	private int mp1;
	
	private int hp2=80;
	private int sp2=20;
	private int mp2=100;
	
	private int hp3=50;
	private int sp3=50;
	private int mp3;
	
	private int hp4=80;
	private int sp4;
	private int mp4=80;
	
	public void move() {
		System.out.println("메딕이 이동하였습니다.");
	}
	
	public void healFi() {
		this.hp1+=3;
		this.mp4-=5;
		if(this.mp4>=0) {
			System.out.println("파벳"+" hp : "+this.hp1+" mp : "+this.mp1+" sp : "+this.sp1
					+" 힐사용!! hp(+3)");
		}else {
			System.out.println("메딕의 마나가 부족합니다.");
		}	
	}
	public void healGh() {
		this.hp2+=3;
		this.mp4-=5;
		if(this.mp4>=0) {
			System.out.println("파벳"+" hp : "+this.hp2+" mp : "+this.mp2+" sp : "+this.sp2
					+" 힐사용!! hp(+3)");
		}else {
			System.out.println("메딕의 마나가 부족합니다.");
		}
	}
	public void healMa() {
		this.hp3+=3;
		this.mp4-=5;
		if(this.mp4>=0) {
			System.out.println("마린"+" hp : "+this.hp3+" mp : "+this.mp3+" sp : "+this.sp3
					+" 힐사용!! hp(+3)");
		}else {
			System.out.println("메딕의 마나가 부족합니다.");
		}
	}
	
	public void die() {
		System.out.println("메딕이 죽었습니다.");
	}	
}
