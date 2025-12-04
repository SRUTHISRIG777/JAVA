package _27_11_25_while_loop;

public class AmstrongNumber {
	public int getPower(int base,int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power=power*base;
		}
		return power;
	}
	public int getCount(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
	}
	public boolean isAmstrong(int num) {
		int count=getCount(num);
		int sum=0;
		int temp=num;
		while(temp!=0) {
			int rem=temp%10;
			sum=sum+getPower(rem,count);
			temp/=10;
		}
		return num==sum;
	}

	public static void main(String[] args) {

		for(int i=1;i<1000;i++) {
			boolean res=new AmstrongNumber().isAmstrong(i);
			if(res) {
				System.out.println(i);
			}
		}
		

	}

}
