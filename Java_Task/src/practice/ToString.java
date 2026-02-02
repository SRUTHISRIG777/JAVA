package practice;
class Employee{
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
//	public String toString() {
//		return "id:  "+id+" "+"name: "+name;
//	}
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

public class ToString {

	public static void main(String[] args) {
		Employee emp=new Employee(1,"sruthi");
		System.out.println(emp);//practice.Employee@4517d9a3
		

	}

}
