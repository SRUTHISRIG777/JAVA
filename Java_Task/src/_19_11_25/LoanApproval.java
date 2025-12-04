package _19_11_25;

public class LoanApproval {
	public String checkLoanApproval(double salary, int creditScore) {
		if(salary>80000 && creditScore>750) {
			 return "Loan approved immediatly";
					 
		}
		else if((salary>=50000 && salary<=80000)&& (creditScore>=650 && creditScore<=750)) {
			return "loan approved with higher interest rate";
		}
		else if((salary>=30000&&salary<=50000)&&(creditScore>=500&&creditScore>=650)) {
			return "co-signed required";
		}
		else {
			return "loan rejected";
		}
		
	}

	public static void main(String[] args) {
		System.out.println(new LoanApproval().checkLoanApproval(900000, 500));
	

	}

}
