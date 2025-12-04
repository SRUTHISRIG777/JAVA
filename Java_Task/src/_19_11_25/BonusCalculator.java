package _19_11_25;

public class BonusCalculator {
	public  double calculateBonus(int experience, int rating, double salary) {
		if(experience>5 && rating>9) {
			return (50*salary)/100;
		}
		else if((experience>=3&&experience<=5)&&(rating>=7&&rating<=9)) {
			return (30*salary)/100;
			
		}
		else if((experience>=1&&experience>=3)&&(rating>=5&&rating>=7)) {
			return (10*salary)/100;
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(new BonusCalculator().calculateBonus(0, 0, 0));
	

	}

}
