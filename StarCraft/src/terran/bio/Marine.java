package terran.bio;

public class Marine {
	public void move() {
		System.out.println("마린이 이동하였습니다.");
	}
	
	public void attackFi() {
		FireBat.hp1-=5;
		if(FireBat.hp1<=0&&FireBat.hp1>=-4) {
			System.out.println("파벳이 죽었습니다.");
			
		}else if(FireBat.hp1>0) {
			System.out.println("파벳"+" hp : "+FireBat.hp1+" mp : "+FireBat.mp1+" sp : "+FireBat.sp1
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
	
	public void state() {
		System.out.println("마린"+" hp : "+FireBat.hp3+" mp : "+FireBat.mp3+" sp : "+FireBat.sp3);
	}
	
	public void steam() {
		FireBat.hp3-=2;
		FireBat.sp3+=10;
		System.out.println("마린"+" hp : "+FireBat.hp3+" mp : "+FireBat.mp3+" sp : "+FireBat.sp3
				+" 스팀팩 사용!! hp(-2) sp(+10)");
	}
	
}
