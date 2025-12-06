package _5_12_2025;

public class AmstrongNumber {
		public static int getPower(int base,int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power=power*base;
			}
		return power;
		}
	public static int getCount(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
	}
	public static boolean isAmstrongNumber(int num) {
		int count=getCount(num);
		int temp=num;
		int sum=0;
		while(temp!=0) {
			int rem=temp%10;
			sum+=getPower(rem,count);
			temp/=10;
		}
		return num==sum;
	}

	

	public static void main(String[] args) {
		
		int num=37;
		boolean res=isAmstrongNumber(num);
		if(res) {
			System.out.println(num+"  is  an amstrong number");
		}
		else {
			System.out.println(num+" is not an amstrong number");
		}

	}

}
