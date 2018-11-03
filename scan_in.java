import java.util.*;
class scan_in
{
public static void main(String args[])
{
 Scanner scn =new Scanner(System.in);
System.out.println("enter the integer value");
int a= scn.nextInt();
/*System.out.println("enter the float value");
float f=scn.nextFloat();*/

System.out.println("enter the string");
String s=scn.nextLine();
System.out.println(a+"integer"+s+"string");    
}
}