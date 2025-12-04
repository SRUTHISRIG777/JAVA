package all_conditional_statements;


public class PositiveOrNegative {
	public String checkingNumber(int num) {
		if(num>0) {
			return "given number is positive number";
		}
		else if(num==0) {
			return "given number is 0";
			
		}
		else {
			return "given number is negative";
		}
	}

	public static void main(String[] args) {
		System.out.println(new PositiveOrNegative().checkingNumber(0));
		

	}

}