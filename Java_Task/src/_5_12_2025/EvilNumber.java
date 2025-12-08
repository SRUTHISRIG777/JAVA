package _5_12_2025;

public class EvilNumber {
	public static boolean isEvilNumber(int num) {
		int temp=num;
		String binary="";
		int count=0;
		while(num>0) {
			int rem=num%2;
			num=num/2;
			binary+=rem;
			
			
		}
		for(int i=0;i<binary.length();i++) {
			char ch=binary.charAt(i);
			if(ch=='1') {
				count++;
				
			}
		}
		return count%2==0;
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isEvilNumber(15));
	}

}
