package _5_12_2025;

public class SpyNumber {
	public static boolean isSpyNumber(int num) {
		int sum=0;
		int pro=1;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			pro*=rem;
			num/=10;
		}
		return pro==sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean res=isSpyNumber(123);
		if(isSpyNumber(12)) {
			System.out.println("it is spy number");
		}
		else {
			System.out.println("it is not spy number");
		}
		//System.out.println(res);

	}

}
