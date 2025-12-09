package _5_12_2025;

public class HappyNumber {
	public static int digitSquare(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+(rem*rem);
			num/=10;
		}
		return sum;
	}
	public static boolean isHappyNumber(int num) {
		while(num!=1&&num!=4) {
			num=digitSquare(num);
			
		}
		return num==1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(isHappyNumber(2)) {
			System.out.println("it is happy number");
		}
		else {
			System.out.println("not happy number");
		}

	}

}
