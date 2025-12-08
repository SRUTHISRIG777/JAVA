package _5_12_2025;

public class BuzzNumber {
	public static boolean isBuzzNumber(int num) {
		int temp=num;
		int lastDigit=temp%10;
		if(num%7==0||lastDigit==7) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBuzzNumber(137));

	}

}
