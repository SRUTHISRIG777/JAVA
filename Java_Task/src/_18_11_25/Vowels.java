package _18_11_25;

public class Vowels {
	public String isVowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return ch+" is vowel";
		}
		else {
			return ch+" is consonent";
		}
	}

	public static void main(String[] args) {
		String result=new Vowels().isVowel('a');
		System.out.println(result);

	}

}
