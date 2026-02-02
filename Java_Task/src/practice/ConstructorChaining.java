package practice;
//class Test1{
//	public Test1() {
//		this(2);
//	
//		System.out.println("first constructor");
//	}
//	public Test1(int a) {
//		this(2,3);
//		System.out.println("second constructor"+a);
//	}
//	public Test1(int a,int b) {
//		
//		System.out.println("third constructor:"+(a+b));
//	}
//	
//}

//class Student{
//	int id;
//	String name;
//	Student(int id){
//		
//		System.out.println("default constructor"+id);
//	}
//	Student(int id,String name){
//		this(id);
//		this.id=id;
//		this.name=name;
//		System.out.println("parameterized constructor"+id);
//		
//	}
//}

class Parent{
	Parent(){
		System.out.println("parent constructor");
	}
	Parent(int a){
		
		System.out.println("parent constructor-2: "+a);
	}
	Parent(int a,int b){
		this(20);
		System.out.println(a+" "+b);
		
	}
	
}
class Child extends Parent{
	Child(){
		super(10,10);
		System.out.println("child constructor");
	}
	
}

public class ConstructorChaining {

	public static void main(String[] args) {
//		new Student(10,"sruthi");
//		new Student(797);
		new Child();

	}

}
