package terran.bio;

public class Medic {
	public void move() {
		System.out.println("메딕이 이동하였습니다.");
	}
	
	public void healFi() {
		Energy.hp1+=3;
		Energy.mp4-=5;
		if(Energy.mp4>=0) {
			System.out.println("파벳"+" hp : "+Energy.hp1+" mp : "+Energy.mp1+" sp : "+Energy.sp1
					+" 힐사용!! hp(+3)");
		}else {
			System.out.println("메딕의 마나가 부족합니다.");
		}	
	}
	public void healGh() {
		Energy.hp2+=3;
		Energy.mp4-=5;
		if(Energy.mp4>=0) {
			System.out.println("고스트"+" hp : "+Energy.hp2+" mp : "+Energy.mp2+" sp : "+Energy.sp2
					+" 힐사용!! hp(+3)");
		}else {
			System.out.println("메딕의 마나가 부족합니다.");
		}
	}
	public void healMa() {
		Energy.hp3+=3;
		Energy.mp4-=5;
		if(Energy.mp4>=0) {
			System.out.println("마린"+" hp : "+Energy.hp3+" mp : "+Energy.mp3+" sp : "+Energy.sp3
					+" 힐사용!! hp(+3)");
		}else {
			System.out.println("메딕의 마나가 부족합니다.");
		}
	}
	
	public void die() {
		System.out.println("메딕이 죽었습니다.");
	}	
}
