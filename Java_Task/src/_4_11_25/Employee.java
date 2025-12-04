package _4_11_25;

public class Employee {
	String employeeName;
	int employeeId;
	double employeeSalary;
	public void addEmployeeDetails(String empname,int empid,double empsalary) {
		employeeName=empname;
		employeeId=empid;
		employeeSalary=empsalary;
	}
	public String displayDetails() {
		return "emp name:"+employeeName+", "+"emp id: "+employeeId+", "+"emp salary: "+employeeSalary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj=new Employee();
		obj.addEmployeeDetails("sruthi sri", 1, 50000);
		String res=obj.displayDetails();
		System.out.println(res);
	}

}
