package terran.bio;

public class Marine extends Skill {
	public final String NAME="Marine";
	
	public void state() {
		System.out.println("마린"+" hp : "+Energy.hp3+" mp : "+Energy.mp3+" sp : "+Energy.sp3);
	}
	
	public void steam() {
		Energy.hp3-=2;
		Energy.sp3+=10;
		System.out.println("마린"+" hp : "+Energy.hp3+" mp : "+Energy.mp3+" sp : "+Energy.sp3
				+" 스팀팩 사용!! hp(-2) sp(+10)");
	}
	
}
