package _5_12_2025;

public class EmirpNumber {
	public static int reverseNumber(int num) {
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num/=10;
		}
		return rev;
	}
	public static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}
	public static boolean isEmirpNumber(int num) {
		if(reverseNumber(num)==num) {
			return false;
		}
		if(isPrime(num)) {
			int rev=reverseNumber(num);
			if(isPrime(rev)) {
				return true;
			}
			
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isEmirpNumber(709)) {
			System.out.println("it is EMIRP number");
		}
		else {
			System.out.println("it is not EMIRP number");
		}

	}

}
