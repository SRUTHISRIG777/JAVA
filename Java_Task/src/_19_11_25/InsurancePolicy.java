package _19_11_25;

public class InsurancePolicy {
	 public String calculatePremium(int age, int experience) {
		 if(age>50&&experience>10) {
			 return "lowest premium";
		 }
		 else if((age>=30&&age<=50)&&experience>=5) {
			 return "moderate premium";
		 }
		 else if((age>=18&&age<=30)&&(experience<5)){
			 return "highest premium";
		 }
		 else {
			 return "not eligible for insurance";
		 } 
	 }

	public static void main(String[] args) {
	       System.out.println(new InsurancePolicy().calculatePremium(45, 5) );

	}

}
