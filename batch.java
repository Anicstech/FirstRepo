import java.util.*;
import java.io.*;
class batch
{

Scanner scan = new Scanner(System.in);
 void fun()
{
         char c=scan.nextInt();
         System.out.println(c);
}
public static void main(String args[])
{
   String s="TRUE";
   System.out.println(Boolean.parseBoolean(s));
   batch b= new batch();
    b.fun();
}

}