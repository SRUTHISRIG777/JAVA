package if_else_task;

public class Vowel {
	public String chekingVowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return ch+"  is vowel";
		}
		else {
			return ch+"  is consonant";
		}
	}

	public static void main(String[] args) {
		System.out.println(new Vowel().chekingVowel('o'));
	

	}

}
