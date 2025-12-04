package simple_if_task;

public class EvenOrOdd {
	public String checkingEvenOrOdd(int num) {
		if(num%2==0) {
			return num+" is even number";
		}
		if(num%2!=0) {
			return num+" is odd number";
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(new EvenOrOdd().checkingEvenOrOdd(6));

	}

}
