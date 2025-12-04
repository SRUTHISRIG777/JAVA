package simple_if_task;

public class CompareThreeNumbers {
	public String largestOfThreeNumbers(int num1,int num2,int num3) {
		if(num1>num2&&num1>num3) {
			return num1+" is largest number";
		}
		if(num1<num2&&num2>num3) {
			return num2+" is largest number";
		}
		if(num3>num2&&num3>num1) {
			return num3+" is largest number";
		}
		return "three numbers are equal";
		
		
		
	}

	public static void main(String[] args) {
		System.out.println(new CompareThreeNumbers().largestOfThreeNumbers(100,100,100));
		

	}

}
