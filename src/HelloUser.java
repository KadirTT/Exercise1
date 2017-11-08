public class HelloUser 
{
	private String userName;
	
	public HelloUser(String uName) {
		userName = uName;
	}
	
	public void greetUser()
	{
		System.out.println("Hello " + userName + "!");
	}

}
