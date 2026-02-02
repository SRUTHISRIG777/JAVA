package practice;
class Car{
	String name;
	String color;
	Engine engine;
	public Car(String name, String color,Engine engine) {
		
		this.name = name;
		this.color = color;
		this.engine=engine;
	}
	
}
class Engine{
	String capacity;
	String type;
	public Engine(String capacity, String type) {
	
		this.capacity = capacity;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + "]";
	}
	
	
}

public class HasRelation {

	public static void main(String[] args) {
		Engine eng=new Engine("10","fuel");
		//System.out.println(eng);
		Car car=new Car("audi","black",eng);
		System.out.println(car.engine.type);
		
		

	}

}
