import java.io.*;
class Great 
{
	public static void main(String args[]) throws IOException
	{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String s,s1;
	System.out.println("enter the string") ;
	s=br.readLine();
	System.out.println("enter the string");
	s1=br.readLine();
	System.out.println(s+" "+s1);
	}
}