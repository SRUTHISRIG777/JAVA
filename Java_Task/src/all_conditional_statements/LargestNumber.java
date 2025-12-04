package all_conditional_statements;



public class LargestNumber {
	public String checkinglargerNumber(int num1,int num2,int num3) {
		if(num1>num2&&num1>num3) {
			return num1+" is larger number";
		}
		else if(num2>num1&&num2>num3){
			return num2+"is larger number";
		}
		else if(num3>num1&&num3>num2) {
			return num3+" is larger number";
		}
		else {
			return "all are equal";
		}
			
		
			
		
	}

	public static void main(String[] args) {
		System.out.println(new LargestNumber().checkinglargerNumber(30,30,30));
		

	}

}
