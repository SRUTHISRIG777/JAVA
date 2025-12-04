package simple_if_task;

public class CompareTwoNumbers {
	public String greaterNumber(int num1,int num2) {
		if(num1>num2) {
			return num1+" is greater number";
		}
		if(num1<num2) {
			return num2+" is greater number";
		}
		if(num1==num2) {
			return "both are equal";
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(new CompareTwoNumbers().greaterNumber(39,6) );
		

	}

}
