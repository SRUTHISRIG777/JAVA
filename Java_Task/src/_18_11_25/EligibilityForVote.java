package _18_11_25;

public class EligibilityForVote {
	public void voteChecking(int age) {
		String result=(age>=18)?"eligible for vote":"not eligible for vote";
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		new EligibilityForVote().voteChecking(20);
		
	

	}

}
