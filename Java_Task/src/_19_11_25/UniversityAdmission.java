package _19_11_25;

public class UniversityAdmission {
	public String  evaluateAdmission(int marks, boolean sportsAchievement) {
		if(marks>=95) {
			return "admitted with scholarship";
		}
		else if(marks>=85&&marks<=94) {
			return "admitted without scholarship";
		}
		else if((marks>=70&&marks<=84)&&sportsAchievement==true) {
			return "admitted with sports quota";
		}
		else if(marks>=60&&marks<=69) {
			return "interview required";
		}
		else {
			return "admission rejected";
		}
	}

	public static void main(String[] args) {
		System.out.println(new UniversityAdmission().evaluateAdmission(75, false));
		

	}

}
