class c_m_d
{
public static void main(String args[])
{
  int count,i=0;
  String string;
   count = args.length;
  System.out.println("Number of arguments = "+count);
   while(i<count)
{
System.out.print(args[i]+"\n");
i=i+1;
}
}
}