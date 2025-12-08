package _5_12_2025;

public class DuckNumber {
	public static boolean isDuckNumber(int num) {
		int temp=num;
		while(temp>9) {
			int rem=temp%10;
			temp/=10;
		
			
		}
		if(temp==0) {
			return false;
		}
		while(num>0) {
			if(num%10==0) {
				return true;
			}
			num/=10;
		}
		return false;
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isDuckNumber(11));

	}

}
