package if_else_task;

public class PositiveOrNegative {
	public String checkingNumber(int num) {
		if(num>=0) {
			return "given number is positive number";
		}
		else {
			return "given number is negative";
		}
	}

	public static void main(String[] args) {
		System.out.println(new PositiveOrNegative().checkingNumber(-9));
		

	}

}
