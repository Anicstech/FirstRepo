class string_usr
{
public static void main(String args[])
	{
                     String s="     hello world is go    is a go  er  one";
	     int a=0,t=0;
	     int count=0; 
                     s = s.trim();
                    String s2 = "hello";
	while(t!=-1)
		{

			a = s.indexOf(' ',a);
                                        
			if( (a-t)>1)
			      {
                                                           if(t==0)
				{
					if(s.substring(t,a).equals(s2))
					count++;
				}
				else{
				if(s.substring(t+1,a).equals(s2))
				count++;
				}
                                                      }		                 
			t = a;
			a =a+1;
                                
		}
	    System.out.println(" total number of words present : "+count);
	}
}