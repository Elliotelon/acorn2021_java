package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		int[] nums=new int[5]; // =>{0,0,0,0,0}
		
		String[] names=new String[3];//=>{null,null,null}
		
		//미리 만들어진 배열에 item 저장하기
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		
		names[0]="김구라";
		names[1]="해골";
		names[2]="원숭이";
	}
}
