import java.io.*;
class Demo
{
	public static void main(String args[]) throws Exception
	{
	  InputStreamReader isr =null;
	  BufferedReader br = null;
	   isr = new InputStreamReader(System.in);
                   br = new BufferedReader(isr,4);
	 System.out.println("enter the number");

                       char c =(char)isr.read();
                   String s= isr.getEncoding();
	   System.out.println(c);
	 System.out.println(s);
	   //System.out.println(c-48);	
	}
}