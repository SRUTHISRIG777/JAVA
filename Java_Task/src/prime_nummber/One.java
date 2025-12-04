package prime_nummber;

public class One {
	public boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res=new One().isPrime(7);
		System.out.println((res)?"it is prime":"it is not prime number");

	}

}
