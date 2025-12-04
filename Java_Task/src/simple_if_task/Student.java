package simple_if_task;

public class Student {
	public String passOrFail(int marks) {
		if(marks>=35) {
			return "pass";
		}
		return "fail";
	}

	public static void main(String[] args) {
		System.out.println(new Student().passOrFail(70));

	}

}
