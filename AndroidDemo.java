package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AndroidDemo 
{
	public static void main(String[] args) throws IOException 
	{
		
		demo();
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("netstat -ano | find \"LISTENING\" | find \"8080\"");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void demo() throws IOException
	{
		String cmd = "netstat -ano | find \"LISTENING\" | find \"4725\"";
		String s1=cmd;
	    ProcessBuilder pb = new ProcessBuilder(s1);
	    pb.redirectErrorStream(true);
	    Process p = pb.start();
	    BufferedReader stdin = new BufferedReader(
	                          new InputStreamReader(p.getInputStream()));
	    StringBuilder commandOutput = new StringBuilder();
	    String line;
	    while ((line = stdin.readLine()) != null) {
	      commandOutput.append(line);
	    }
	    int exitValue = -1;
	    try {
	     exitValue = p.waitFor();
	    } catch (InterruptedException e) {
	    // do something here   
	    }

	}
	
	
}
