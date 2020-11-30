package terran.bio;

public class FireBat extends Skill{
	public final String NAME="FireBat";
	
	
	public void move() {
		System.out.println(this.NAME+"이(가) 이동하였습니다.");
	}

	public void die() {
		System.out.println("파벳이 죽었습니다.");
	}
	
}
