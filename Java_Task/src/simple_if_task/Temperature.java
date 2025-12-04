package simple_if_task;

public class Temperature {
	public String checkTemperature(int temp) {
		if(temp>30) {
			return "hot";
		}
		return "cold";
	}

	public static void main(String[] args) {
		System.out.println(new Temperature ().checkTemperature(20));
		

	}

}
