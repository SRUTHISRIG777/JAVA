package _24_11_2025_for_loop;
//printing odd numbers from 1 to 15
public class Question4 {
	public void printOddNumbers() {
		for(int i=1;i<=15;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		new Question4().printOddNumbers();
	

	}

}
