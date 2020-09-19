import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Po1bufferreader {
	public static void main(String args[])
	{
		try {
			BufferedReader br=  new BufferedReader (new FileReader("india.txt"));
			System.out.println("the message is");
			br.lines().forEach(line ->  System.out.println(line));
		}
		catch(IOException e)
		{
			System.out.println("Error:"+e.getMessage());
			
		}
	}


}
