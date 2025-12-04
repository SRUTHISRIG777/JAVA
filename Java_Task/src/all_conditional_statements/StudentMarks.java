package all_conditional_statements;

public class StudentMarks {
	public void checkingMarks(int marks) {
		if (marks > 35) {
		    System.out.println("Pass");

		    if (marks > 75) {
		        System.out.println("Distinction");
		    }
		} else {
		    System.out.println("Fail");
		}

	}

	public static void main(String[] args) {
		new StudentMarks().checkingMarks(5);
		

	}

}
