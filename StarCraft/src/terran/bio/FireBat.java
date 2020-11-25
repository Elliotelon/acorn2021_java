package terran.bio;

public class FireBat {
	//체력(hp), 마나(mp), 공격속도(sp) 
	//파벳의 능력치
	public static int hp1=50;
	public static int sp1=50;
	public static int mp1;
	
	//고스트의 능력치
	public static int hp2=80;
	public static int sp2=20;
	public static int mp2=100;
	
	//마린의 능력치
	public static int hp3=50;
	public static int sp3=50;
	public static int mp3;
	
	//메딕의 능력치
	public static int hp4=80;
	public static int sp4;
	public static int mp4=80;
	
	public void move() {
		System.out.println("파벳이 이동하였습니다.");
	}
	
	public void attackMa() {
		FireBat.hp3-=5;
		if(FireBat.hp3<=0&&FireBat.hp3>=-4) {
			System.out.println("마린이 죽었습니다.");
			
		}else if(FireBat.hp3>0) {
			System.out.println("마린"+" hp : "+FireBat.hp3+" mp : "+FireBat.mp3+" sp : "+FireBat.sp3
					+" 공격당함!! hp(-5)");
		}else {
			System.out.println("");
		}
	}
	public void attackGh() {
		FireBat.hp2-=5;
		if(FireBat.hp2<=0&&FireBat.hp2>=-4) {
			System.out.println("고스트가 죽었습니다.");
			
		}else if(FireBat.hp2>0) {
			System.out.println("고스트"+" hp : "+FireBat.hp2+" mp : "+FireBat.mp2+" sp : "+FireBat.sp2
					+" 공격당함!! hp(-5)");
		}else {
			System.out.println("");
		}
	}
	public void attackMe() {
		FireBat.hp4-=5;
		if(FireBat.hp4<=0&&FireBat.hp4>=-4) {
			System.out.println("메딕이 죽었습니다.");
			
		}else if(FireBat.hp4>0) {
			System.out.println("메딕"+" hp : "+FireBat.hp4+" mp : "+FireBat.mp4+" sp : "+FireBat.sp4
					+" 공격당함!! hp(-5)");
		}else {
			System.out.println("");
		}
	}
	
	public void die() {
		System.out.println("파벳이 죽었습니다.");
	}
	
	public void steam() {
		FireBat.hp1-=2;
		FireBat.sp1+=10;
		System.out.println("파벳"+" hp : "+FireBat.hp1+" mp : "+FireBat.mp1+" sp : "+FireBat.sp1
				+" 스팀팩 사용!! hp(-2) sp(+10)");
	}
}
