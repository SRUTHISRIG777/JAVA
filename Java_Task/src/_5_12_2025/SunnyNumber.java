package _5_12_2025;

public class SunnyNumber {
	public static boolean isSunnyNumber(int num) {
		int s=num+1;
		 float root=(float) Math.sqrt(s);
		if(root==(int)root) {
			return true;
			
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSunnyNumber(20));

	}

}
