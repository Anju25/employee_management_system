package businessLogic;

public class Validation 
{

	public boolean check(String email, String password, String confirmpswd) {
	
		if(checkemail(email) && password.equals(confirmpswd))
			return true;
		return false;
	}

	private boolean checkemail(String email) 
	{
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		boolean value=email.matches(regex);
		return value;	
	}
  
}
