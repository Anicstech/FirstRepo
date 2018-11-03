import java.io.*;
	class lcm1
{
public static void main(String args[]) throws Exception
	{
		int a,b;
		int flag=0,lcm=1,c;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("enter the first digit");
		a=Integer.parseInt(br.readLine());
		System.out.println("enter the second number");
		b=Integer.parseInt(br.readLine());
			if(b>a)
			    c=b;
			else
			c=a;
		//int c=b;
		for(int i=2;i<=c;i++)
			{
				for(int j =2;j<Math.sqrt(i);j++)
					{
						if(i%j==0)
						     {		
						      flag =1;break;
						      }
					}
				if(flag!=1)
					{
						//System.out.println("this is working");
						while(a%i==0 || b%i==0)
							{
							    if(a%i==0)
								a=a/i;
							    if(b%i==0)
								b=b/i;
							lcm = lcm *i;
					
		                                                                                }
				

			
                                                  		}
				flag=0;
			
                                                           }
                   System.out.println("lcm of two numbers is"+lcm);
	}
}