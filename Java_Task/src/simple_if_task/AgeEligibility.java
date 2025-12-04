package simple_if_task;

public class AgeEligibility {
	public String checkingEligible(int age) {
		if(age>=18) {
			return "eligible to vote";
		}
		return "not eligible";
	}

	public static void main(String[] args) {
		System.out.println(new AgeEligibility ().checkingEligible(1) );
		

	}

}
