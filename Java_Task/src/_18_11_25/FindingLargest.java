package _18_11_25;

public class FindingLargest {
	public String largestNumber(int num1,int num2,int num3) {
		if(num1>num2&&num1>num3) {
			return num1+" is largest number";
		}
		else {
			if(num2>num1&&num2>num3) {
				return num2+" is largest number";
				
			}
			else {
				if(num3>num1&&num3>num2) {
					return num3+" is largest number";
					
				}
				else {
					return "all are equal";
				
				}
			}
			
		}
	}

	public static void main(String[] args) {
		String result=new FindingLargest().largestNumber(3, 3, 3);
		System.out.println(result);
		

	}

}
