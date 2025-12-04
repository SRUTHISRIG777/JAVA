package if_else_task;

public class EligibilityToVote {
	public String chekingEligibility(int age) {
		if(age>=18) {
			return "eligible to vote";
		}
		else {
			return "not eligible to vote";
		}
	}

	public static void main(String[] args) {
		
		System.out.println(new EligibilityToVote().chekingEligibility(18));
		

	}

}
