package _5_12_2025;

public class StrongNumber {
	public static boolean isStrongNumber(int num) {//145
		int temp=num;
		int sum=0;
		int fact=1;
		while(num>0) {
			int rem=num%10;//5
			for(int i=1;i<=rem;i++) {
			
				fact*=i;
				
			}
			System.out.println(fact);
			sum+=fact;//120
			num/=10;
			fact=1;
		}
		return temp==sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isStrongNumber(123));

	}

}
