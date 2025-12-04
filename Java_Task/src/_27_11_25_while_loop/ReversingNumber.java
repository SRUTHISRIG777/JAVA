package _27_11_25_while_loop;

public class ReversingNumber {
	public void printReversedNumber(int num) {
		System.out.println("original number: "+num);
		int rev=0;
		do {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}while(num>0);
		System.out.println("reversed number :"+rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ReversingNumber().printReversedNumber(534406);

	}

}
