package prime_nummber;

public class Two {
	public boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2;i<=100;i++) {
			if(new Two().isPrime(i)) {
				System.out.println(i);
			}
			
		}
//		boolean res=new Two().isPrime(8);
//		System.out.println((res)?"it is prime":"it is not prime number");

	}

}
