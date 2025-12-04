package examples;

public class ReverseNumber {
	public void reversingNumber(int num) {
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReverseNumber().reversingNumber(12348796);

	}

}
