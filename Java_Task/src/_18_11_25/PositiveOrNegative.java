package _18_11_25;

public class PositiveOrNegative {
	public boolean checkingNumber(int num) {
		if(num>0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		boolean result=new PositiveOrNegative().checkingNumber(3);
	
		if(result) {
			System.out.println("given number is positive");
		}
		else {
			System.out.println("given number is negative");
		}
		

	}

}
