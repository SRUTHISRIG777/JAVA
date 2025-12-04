package all_conditional_statements;

public class LeapYear {
	public String checkLeapYear(int year) {
		if((year%400==0)||(year%4==0&&year%100!=0)) {
			return year+" is leap year";
		}
		else {
			return year+" is not leap year";
		}
	}

	public static void main(String[] args) {
		
		System.out.println(new LeapYear().checkLeapYear(1600));

	}

}
