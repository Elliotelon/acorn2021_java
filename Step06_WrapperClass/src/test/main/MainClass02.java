package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		double num1=10.1;
		Double num2=10.2;
		
		double result1=num2+10;
		double result2=num1+num2;
		Double result3=num1+num2;
		
		//10.2=>"10.2"
		String result4=num2.toString();
		//"99.9"=>99.9
		double result5=Double.parseDouble("99.9");
		
	}
}
