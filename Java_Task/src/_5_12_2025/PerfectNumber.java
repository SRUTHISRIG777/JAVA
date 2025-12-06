package _5_12_2025;

public class PerfectNumber {
	public static boolean isPerfectNumber(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum==num;
	}
	public static void printPerfectNUmbers(int n) {
		for(int i=1;i<=n;i++) {
			if(isPerfectNumber(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("printing perfect numbers from 1 to 100");
		
		printPerfectNUmbers(100);
		
		

	}

}
