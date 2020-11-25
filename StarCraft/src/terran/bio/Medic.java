package terran.bio;

public class Medic {
	public void move() {
		System.out.println("메딕이 이동하였습니다.");
	}
	
	public void healFi() {
		FireBat.hp1+=3;
		FireBat.mp4-=5;
		if(FireBat.mp4>=0) {
			System.out.println("파벳"+" hp : "+FireBat.hp1+" mp : "+FireBat.mp1+" sp : "+FireBat.sp1
					+" 힐사용!! hp(+3)");
		}else {
			System.out.println("메딕의 마나가 부족합니다.");
		}	
	}
	public void healGh() {
		FireBat.hp2+=3;
		FireBat.mp4-=5;
		if(FireBat.mp4>=0) {
			System.out.println("고스트"+" hp : "+FireBat.hp2+" mp : "+FireBat.mp2+" sp : "+FireBat.sp2
					+" 힐사용!! hp(+3)");
		}else {
			System.out.println("메딕의 마나가 부족합니다.");
		}
	}
	public void healMa() {
		FireBat.hp3+=3;
		FireBat.mp4-=5;
		if(FireBat.mp4>=0) {
			System.out.println("마린"+" hp : "+FireBat.hp3+" mp : "+FireBat.mp3+" sp : "+FireBat.sp3
					+" 힐사용!! hp(+3)");
		}else {
			System.out.println("메딕의 마나가 부족합니다.");
		}
	}
	
	public void die() {
		System.out.println("메딕이 죽었습니다.");
	}	
}
