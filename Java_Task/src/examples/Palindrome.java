package examples;

public class Palindrome {
	public void isPalindrome(int number) {
		int rev=0;
		int temp=number;
		while(number<0) {
			rev=rev*10+number;
			number/=10;
		}
		if(temp==rev) {
			System.out.println("it is palindrome");
		}
		else {
		     System.out.println("it is not palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Palindrome().isPalindrome(1234321);
		

	}

}
