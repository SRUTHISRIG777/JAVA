package _19_11_25;

public class MovieTheater {
	 public double getTicketPrice(int age) {
		 if(age<5) {
			 return 0.0; 
		 }
		 else if(age>=5&&age<=12) {
			 return 5.0;
		 }
		 else if(age>=13 && age<=60) {
			 return 10.0;
		 }
		 else {
			 return (50*10)/100;
		 }
	 }
	

	public static void main(String[] args) {
		System.out.println(new MovieTheater().getTicketPrice(22));
	

	}

}
