package simple_if_task;

public class DiscountEligibility {
	public String checkingEligibility(double amount) {
		if(amount>500) {
			return "provided discount is :"+ (amount*10/100);
		}
		return "no discount";
	}

	public static void main(String[] args) {
		System.out.println(new DiscountEligibility().checkingEligibility(60));
	

	}

}
