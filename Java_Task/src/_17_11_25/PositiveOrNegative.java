package _17_11_25;

public class PositiveOrNegative {
	public String checkNumber(int num) {
		if(num>0) {
			return "positive number";
		}
		if(num<0) {
			return "negative number";
		}
		if(num==0) {
			return "zero";
		}
		return null;
	}

	public static void main(String[] args) {
		PositiveOrNegative obj=new PositiveOrNegative();
		System.out.println("check -7: "+obj.checkNumber(-7));
		
		

	}

}
