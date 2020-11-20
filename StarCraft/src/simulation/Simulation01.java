package simulation;

import terran.bio.FireBat;
import terran.bio.Ghost;
import terran.bio.Marine;
import terran.bio.Medic;

public class Simulation01 {
	public static void main(String[] args) {
		Marine marine1=new Marine();
		FireBat firebat1=new FireBat();
		Medic medic1=new Medic();
		Ghost ghost1=new Ghost();
		
		marine1.move();
		marine1.attackFi();
		marine1.attackGh();
		marine1.attackMe();
		marine1.steam();
		
		System.out.println("------------------------------------------------------");
		firebat1.move();
		firebat1.attackMa();
		firebat1.attackGh();
		firebat1.attackMe();
		firebat1.steam();
		
		System.out.println("------------------------------------------------------");
		ghost1.move();
		ghost1.attackMa();
		ghost1.attackFi();
		ghost1.attackMe();
		ghost1.clock();
		
		System.out.println("------------------------------------------------------");
		medic1.move();
		medic1.healMa();
		medic1.healFi();
		medic1.healGh();
		
		System.out.println("------------------------------------------------------");
		
		marine1.attackFi();
		marine1.attackFi();
		marine1.attackFi();
		marine1.attackFi();
		marine1.attackFi();
		marine1.attackFi();
		marine1.attackFi();
		marine1.attackFi();
		marine1.attackFi();
		
		
		
	
		
		
		
		//마린이 공격해서 상대에너지가 0이하가 될때 상대 사망
		if(marine1.hp1<=0) {
			firebat1.die();
		}
		if(marine1.hp2<=0) {
			ghost1.die();
		}
		if(marine1.hp4<=0) {
			medic1.die();
		}
		
		//파벳이 공격해서 상대에너지가 0이하가 될때 상대 사망
		if(firebat1.hp2<=0) {
			ghost1.die();
		}
		if(firebat1.hp3<=0) {
			marine1.die();
		}
		if(firebat1.hp4<=0) {
			medic1.die();
		}
		//고스트가 공격해서 상대에너지가 0이하가 될때 상대 사망
		if(ghost1.hp1<=0) {
			firebat1.die();
		}
		if(ghost1.hp3<=0) {
			marine1.die();
		}
		if(ghost1.hp4<=0) {
			medic1.die();
		}
	}
}
