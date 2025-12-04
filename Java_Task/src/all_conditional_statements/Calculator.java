package all_conditional_statements;

public class Calculator {
	public void claculations(int a,int b,String operator) {
		switch(operator) {
		case "+":
			System.out.println(a+b);
			break;
		
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		default:
			System.out.println("enter valid operator");
	}
	}

	public static void main(String[] args) {
		new Calculator().claculations(20, 10, "/");
		

	}

}
