import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		try {
			String line=buffer.readLine();
			System.out.println(line);
		}catch(Exception e)
		{
			
		}
	}

}
