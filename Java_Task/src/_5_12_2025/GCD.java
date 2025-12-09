package _5_12_2025;

public class GCD {
	public static int getGCD(int num1,int num2) {
		if(num2==0) {
			return num1;
		}
		return getGCD(num2,num1%num2);
	}
	public static int  getLCM(int num1,int num2) {
		return (num1*num2)/getGCD(num1,num2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=48,num2=18;
		System.out.println(getGCD(num1,num2));
		System.out.println(getLCM(num1,num2));

	}

}
