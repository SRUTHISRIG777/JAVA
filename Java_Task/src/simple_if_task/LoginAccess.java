package simple_if_task;

public class LoginAccess {
	public String checkAccess(String username) {
		if(username=="admin") {
			return "Access Granted";
		}
		return "access not granted";
	}

	public static void main(String[] args) {
	
		System.out.println(new LoginAccess().checkAccess("admin"));

	}

}
