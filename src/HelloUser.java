import java.io.BufferedReader;
import java.io.InputStreamReader;
	
public class HelloUser {
	private String userName;
	
	public HelloUser(String uName) {
		userName = uName;
	}
	
	public void greetUser()
	{
		System.out.println("Hello " + userName + "!");
				
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			String line=buffer.readLine();
		}
		catch(Exception e)
		{
			
		}
	}

}
