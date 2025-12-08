package _5_12_2025;

public class TechNumber {
	public static int getCount(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	
	public static boolean isTechNumber(int num) {//2025
		String str=num+"";
		if(str.length()%2!=0) {
			return false;
		}
		int mid=str.length()/2;
		String left="";
		String right="";
		for(int i=0;i<mid;i++) {
			char ch=str.charAt(i);
			left+=ch;
		}
		for(int i=str.length()/2;i<str.length();i++) {
			char ch=str.charAt(i);
			right+=ch;
			
		}
		System.out.println(left);
		System.out.println(right);
		int l=Integer.parseInt(left);
		int r=Integer.parseInt(right);
		if(((l+r)*(l+r)==num)){
			return true;
		}
		else {
			return false;
		}
		
		
		
		
		
		
//		while(num>0) {
//			int rem=num%10;
//			str+=rem;
//			num/=10;
//		}
//		return str;
		
	
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isTechNumber(2025));
		System.out.println(isTechNumber(8));

		//isTechNumber(2025);
	}

}
