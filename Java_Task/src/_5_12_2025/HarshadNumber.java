package _5_12_2025;

public class HarshadNumber {
	public static boolean isHarshadNumber(int num) {
		int temp=num;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum+=rem;
			temp/=10;
		}
		return num%sum==0;
	}
	public static void printHarshadNumbers(int n) {
		for(int i=1;i<=n;i++) {
			if(isHarshadNumber(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		int n=50;
		System.out.println("printing harshad numbers from 1 to 50");
		printHarshadNumbers(n);
		
		

	}

}
