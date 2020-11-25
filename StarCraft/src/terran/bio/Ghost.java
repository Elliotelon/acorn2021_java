package terran.bio;

public class Ghost {
	public void move() {
		System.out.println("고스트가 이동하였습니다.");
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
		System.out.println("고스트가 죽었습니다.");
	}
	
	public void clock() {
		FireBat.mp2-=30;
		if(FireBat.mp2>=0) {
			System.out.println("고스트"+" hp : "+FireBat.hp2+" mp : "+FireBat.mp2+" sp : "+FireBat.sp2
					+" 투명모드사용!! mp(-30)");
		}else {
			System.out.println("마나가 부족합니다.");
		}
	}
}
