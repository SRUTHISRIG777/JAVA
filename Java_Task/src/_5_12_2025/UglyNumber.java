package _5_12_2025;

public class UglyNumber {
	public static boolean isUglyNumber(int num) {
		
		while(num>0) {
			if(num%2==0) {
				num/=2;
			}
			else if(num%3==0) {
				num/=3;
			}
			else if(num%5==0) {
				num/=5;
			}
			else {
				break;
			}
		}
		return num==1;
	}

	public static void main(String[] args) {
		
		boolean res=isUglyNumber(9);
		if(res) {
			System.out.println("it is an ugly number");
		}
		else {
			System.out.println("it is not ugly number");
		}

	}

}
