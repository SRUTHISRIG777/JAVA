package _4_11_25;

public class Car {
	String carMake;
	String carModel;
	int manufacturingYear;
	public void addCarDetails(String carmake,String carmodel,int year) {
		carMake=carmake;
		carModel=carmodel;
		manufacturingYear=year;
	}
	public String displayDetails() {
		return "car make: "+carMake+","+"car model: "+carModel+","+"year:  "+manufacturingYear;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.addCarDetails("ford","new model",2025);
		String res=obj.displayDetails();
		System.out.println(res);
		

	}

}
