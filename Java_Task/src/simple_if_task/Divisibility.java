package simple_if_task;

public class Divisibility {
	public String checkingDivisibility(int num) {
		if(num%3==0&&num%5==0) {
			return "divisible by both 3 and 5";
		}
		if(num%5==0) {
			return "divisible by 5";
		}
		if(num%3==0) {
		 return "divisible by 3";
		}
		return "not divisible by 3 and 5";
	}

	public static void main(String[] args) {
		System.out.println(new Divisibility().checkingDivisibility(23));
	

	}

}
