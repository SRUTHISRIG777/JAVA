package practice;

public class PerfectNumber {
	public boolean isPerfectNumber(int num) {
		int sum=0;
//		for(int i=1;i<num;i++) {
//			if(num%i==0) {
//				sum+=i;
//			}
//			
//		}
		int i=1;
		while(i<num) {
			if(num%i==0) {
				sum+=i;
			}
			i++;
		}
		return sum==num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res=new PerfectNumber().isPerfectNumber(6);
		System.out.println(res);
		for(int i=1;i<=100;i++) {
			if(new PerfectNumber().isPerfectNumber(i)) {
				System.out.println(i);
			}
		}

	}

}
