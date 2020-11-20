package test.main;

import test.mart.Computer;
import test.mart.Cpu;
import test.mart.HardDisk;
import test.mart.Memory;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * [프로그래밍의 목적]
		 * 
		 * 1.게임을 한다.
		 * 2.oli999@naver.com으로 이메일을 보낸다.
		 * 
		 */
		
		Computer com1=new Computer(new Cpu(), new Memory(), new HardDisk());
		com1.playGame();
		com1.sendEmail("oli999@naver.com");
		
		Cpu c1=new Cpu();
		Memory m1=new Memory();
		HardDisk h1=new HardDisk();
		
		Computer com2=new Computer(c1, m1, h1);
		com2.playGame();
		com2.sendEmail("oli999@naver.com");
		
		
		
		
	}
}
