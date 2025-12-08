package _5_12_2025;

public class AutoMorphicNumber {
	public static boolean isAutomorphic(int num) {
		int sq=num*num;
		int lastDigit=sq%10;
		if(num==lastDigit) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAutomorphic(7));

	}

}
