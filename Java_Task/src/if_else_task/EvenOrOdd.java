package if_else_task;

public class EvenOrOdd {
	public String checkingNumber(int num) {
		if(num%2==0) {
			return "given number is even";
		}
		else {
			return "given number is odd";
		}
	}

	public static void main(String[] args) {
		
		System.out.println(new EvenOrOdd().checkingNumber(8));

	}

}
