package terran.bio;

public class Skill {
	public final String NAME="Skill";
	
	public void move() {
		System.out.println(this.NAME+"이 이동하였습니다.");
	}

	public void attackMa() {
		Energy.hp3-=5;
		if(Energy.hp3<=0&&Energy.hp3>=-4) {
			System.out.println("마린이 죽었습니다.");
			
		}else if(Energy.hp3>0) {
			System.out.println("마린"+" hp : "+Energy.hp3+" mp : "+Energy.mp3+" sp : "+Energy.sp3
					+" 공격당함!! hp(-5)");
		}else {
			System.out.println("");
		}
	}
	public void attackFi() {
		Energy.hp1-=5;
		if(Energy.hp1<=0&&Energy.hp1>=-4) {
			System.out.println("파벳이 죽었습니다.");
			
		}else if(Energy.hp1>0) {
			System.out.println("파벳"+" hp : "+Energy.hp1+" mp : "+Energy.mp1+" sp : "+Energy.sp1
					+" 공격당함!! hp(-5)");
		}else {
			System.out.println("");
		}
	}
	public void attackGh() {
		Energy.hp2-=5;
		if(Energy.hp2<=0&&Energy.hp2>=-4) {
			System.out.println("고스트가 죽었습니다.");
			
		}else if(Energy.hp2>0) {
			System.out.println("고스트"+" hp : "+Energy.hp2+" mp : "+Energy.mp2+" sp : "+Energy.sp2
					+" 공격당함!! hp(-5)");
		}else {
			System.out.println("");
		}
	}
	public void attackMe() {
		Energy.hp4-=5;
		if(Energy.hp4<=0&&Energy.hp4>=-4) {
			System.out.println("메딕이 죽었습니다.");
			
		}else if(Energy.hp4>0) {
			System.out.println("메딕"+" hp : "+Energy.hp4+" mp : "+Energy.mp4+" sp : "+Energy.sp4
					+" 공격당함!! hp(-5)");
		}else {
			System.out.println("");
		}
	}

	public void steam() {
		Energy.hp1-=2;
		Energy.sp1+=10;
		System.out.println("파벳"+" hp : "+Energy.hp1+" mp : "+Energy.mp1+" sp : "+Energy.sp1
				+" 스팀팩 사용!! hp(-2) sp(+10)");
	}
	
	public void clock() {
		Energy.mp2-=30;
		if(Energy.mp2>=0) {
			System.out.println("고스트"+" hp : "+Energy.hp2+" mp : "+Energy.mp2+" sp : "+Energy.sp2
					+" 투명모드사용!! mp(-30)");
		}else {
			System.out.println("마나가 부족합니다.");
		}
	}
}
