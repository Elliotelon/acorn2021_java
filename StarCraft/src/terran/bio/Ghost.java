package terran.bio;

public class Ghost extends Skill {
	public void move() {
		System.out.println("고스트가 이동하였습니다.");
	}
	
	public void die() {
		System.out.println("고스트가 죽었습니다.");
	}
}
