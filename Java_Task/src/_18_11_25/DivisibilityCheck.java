package _18_11_25;

public class DivisibilityCheck {
	public void divisible(int num) {
		if((num%5==0)&&(num%11==0)) {
			System.out.println(num+" is divisible by both 5 and 11");
		}
		else {
			System.out.println(num+" is not divisible by both 5 and 11");
			
		}
		
	}

	public static void main(String[] args) {
		new DivisibilityCheck().divisible(110);
		

	}

}
