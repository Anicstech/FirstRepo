class format_method
{
public static void main(String args[])
{
int count=0;
    String s =new String("sonoo");
    String s1 = String.format("name of the person is %s",s);
    String s2 = String.format("value of %d",12);
    String s3 = String.format("value is %.12f",32.1211212);
    System.out.println(s.contains("oas"));
String joinString1=String.join("\\n","welcome","to","javatpoint");  
System.out.println(joinString1); 
   System.out.println(s.replace('o','a')); 
   System.out.println(s);
/* ------------------------------------------------------*/
int ch = Integer.parseInt("133");
System.out.println("s1  "+s1);
System.out.println("s2  "+s2);
System.out.println("s3  "+s3);
String s4="java string split    method by javatpoint";  
String[] words=s4.split("\\s");//splits the string based on whitespace  
//using java foreach loop to print elements of string array  
/*for(String w:words){  
if((Character.parseChar(w))!=' ')
count++;
System.out.println(w); 
}*/
//System.out.println("total number of words are  " +count);
}
}