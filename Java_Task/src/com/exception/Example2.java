package com.exception;
class InvalidAgeOfBattery extends Exception{
	public InvalidAgeOfBattery(String msg) {
		super(msg);
	}
}
class InvalidAgeOfTyre extends Exception{
	public InvalidAgeOfTyre(String msg) {
		super(msg);
	}
}
class InvalidAgeOfEngine extends Exception{
	public InvalidAgeOfEngine(String msg) {
		super(msg);
	}
}
class CheckAge{
//	public void checkingAge(int Bage,int Tage,int Eage )throws InvalidAgeOfBattery {
//		if(Bage<2) {
//			throw new InvalidAgeOfBattery("invalid battery age"); 
//		}
//		else if(Tage<5) {
//			throw new InvalidAgeOfTyre("invalid tyre age"); 
//			
//		}
//		else if (Eage<10) {
//			throw new InvalidAgeOfEngine("invalid engine age"); 
//		}
//		else {
//			System.out.println("success");
//		}
//		if(Bage<2) {
//			throw new InvalidAgeOfBattery("invalid battery age"); 
//		}
//		if(Tage<5) {
//			throw new InvalidAgeOfTyre("invalid tyre age");
//		}
//		if (Eage<10) {
//			throw new InvalidAgeOfEngine("invalid engine age"); 
//		}
		
		
		
	//}
	public void checkingTyreAge(int age)throws InvalidAgeOfTyre  {
		if(age<5) {
			throw new InvalidAgeOfTyre("invalid tyre age");
			
		}
		else {
			System.out.println("success");
		}
	}
	public void checkingBatteryAge(int age)throws InvalidAgeOfBattery  {
		if(age<5) {
			throw new InvalidAgeOfBattery("invalid battery age");
			
		}
		else {
			System.out.println("success");
		}
	}
	public void checkingEngineAge(int age)throws InvalidAgeOfEngine  {
		if(age<5) {
			throw new InvalidAgeOfEngine("invalid battery age");
			
		}
		else {
			System.out.println("success");
		}
	}
	
}

public class Example2 {

	public static void main(String[] args) {
		try {
			//new CheckAge().checkingAge(1, 1, 1);
			new CheckAge().checkingBatteryAge(0);
			new CheckAge().checkingEngineAge(0);
			new CheckAge().checkingTyreAge(0);
		}
		catch(InvalidAgeOfBattery e) {
			e.printStackTrace();
		}
		catch(InvalidAgeOfTyre e) {
			e.printStackTrace();
		}
		catch(InvalidAgeOfEngine e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");

	}

}
