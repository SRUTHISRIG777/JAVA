package _5_12_2025;

public class FibonacciNumber {
	public static boolean isPerfectSquare(int num) {

		int root=(int)Math.sqrt(num);
		return (root*root)==num;

	}
	public static boolean isFibonacci(int num) {
		if(num<0) {
			return false;
		}
		int a=5*num*num+4;
		int b=5*num*num-4;
		return isPerfectSquare(a)||isPerfectSquare(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isFibonacci(5)) {
			System.out.println("it is fibonacci number");
		}
		else {
			System.out.println("it is not fibonacci number");
		}

	}

}
