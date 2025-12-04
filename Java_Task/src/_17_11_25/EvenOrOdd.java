package _17_11_25;

public class EvenOrOdd {
	public boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		EvenOrOdd obj=new EvenOrOdd();
		System.out.println("is 10 even?  "+obj.isEven(10));
	}

}
