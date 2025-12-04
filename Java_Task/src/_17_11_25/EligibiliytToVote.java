package _17_11_25;

public class EligibiliytToVote {
	public boolean canVote(int age) {
		if(age>=18) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		EligibiliytToVote obj=new EligibiliytToVote();
		System.out.println("can vote (Age 20)? "+obj.canVote(20));
	

	}

}
