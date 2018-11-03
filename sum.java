import java.io.*;
class sum
{
public static void main(String args[])
{
int a,b,c;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.println("enter the first number");
a=Integer.parseInt(br.readLine());
System.out.println("enter the scond number");
b=Integer.parseInt(br.readLine());
c = a+b;
System.out.println("sum of a and b is "+c);
}
catch(Exception e)
{
System.out.println("Exception is present");
}

}
}