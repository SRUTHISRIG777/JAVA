package _18_11_25_task;

public class PositiveOrNegative {
	public String checkingNumber(int num) {
		if(num>0) {
			return "it is positive number";
		}
		if(num<0) {
			return "it is negative number";
		}
		if(num==0) {
			return "given number is zero";
		}
		return null;
		
	}

	public static void main(String[] args) {
		System.out.println(new PositiveOrNegative().checkingNumber(-1));
		

	}

}
