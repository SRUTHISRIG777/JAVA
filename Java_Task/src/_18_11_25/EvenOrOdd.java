package _18_11_25;

public class EvenOrOdd {
	public String isEven(int num) {
		if(num%2==0) {
			return "it is even number";
		}
		else {
			return "it is odd number";
		}
	}

	public static void main(String[] args) {
		new EvenOrOdd();
		String result=new EvenOrOdd().isEven(4);
		System.out.println(result);
		

	}

}
