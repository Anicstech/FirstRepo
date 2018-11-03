import java.io.*;
class char_fun
{
public static void main(String args[]) throws Exception
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the character");
char c=(char)br.read();

if(Character.isLetter(c))
{
if(Character.isLowerCase(c))
System.out.println("lowercase");
else
System.out.println("uppercase");
}
else
if(Character.isDigit(c))
System.out.println("digit");
else
/*if(Character.isWhiteSpace(c))
System.out.println("whitespace");
else*/
System.out.println("invalid");
}
}