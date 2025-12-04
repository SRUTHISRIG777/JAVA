package _24_11_2025_for_loop;
//printing even numbers from 2 to 20
public class Question3 {
	public void printEvenNumbers() {
		for(int i=2;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Question3().printEvenNumbers();

	}

}
