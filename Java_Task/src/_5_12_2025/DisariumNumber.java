package _5_12_2025;

public class DisariumNumber {
	public static boolean isDisariumNumber(int num) {
		int count=0;
		int temp=num;
		int temp1=num;
		while(temp>0) {
			count++;
			temp/=10;
		}//123
		int sum=0;
		while(num>0) {
			int rem=num%10;//2
			sum=(int) (sum+Math.pow(rem,count));//9+4=13
			num/=10;//1
			count--;//1
			
		}
		return sum==temp1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDisariumNumber(135));

	}

}
