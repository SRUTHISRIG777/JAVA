package all_conditional_statements;

public class Temperature {
	public String checkingTemperature(int temp) {
		if(temp<0) {
			return "cold";
		}
		else if(temp>=0&&temp<=20) {
			return "warm";
		}
		else {
			return "hot";
		}
	}

	public static void main(String[] args) {
		System.out.println(new Temperature().checkingTemperature(15));
		

	}

}
