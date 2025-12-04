package _27_11_25_while_loop;

public class NeonNumber {
	public boolean isNeonNumber(int num) {
		int square=num*num;
		int sum=0;
		while(square>0) {
			int remainder=square%10;
			sum+=remainder;
			square/=10;
			
		}
		return sum==num;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result=new NeonNumber().isNeonNumber(9);
		System.out.println((result)?"it is neon number":"it is not neon number");

	}

}
