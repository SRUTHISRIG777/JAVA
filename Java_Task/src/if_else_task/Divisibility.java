package if_else_task;

public class Divisibility {
	public String checkingDivisibility(int num) {
		if(num%5==0 && num%11==0) {
			return "given number is divisible by both 5 and 11";
		}
		else {
			return "given number is not  divisible by both 5 and 11";
		}
	}

	public static void main(String[] args) {
		System.out.println(new Divisibility().checkingDivisibility(1101));


	}

}
