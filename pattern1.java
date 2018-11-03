class pattern1
{
public static void main(String args[])
{
for(int i=1;i<6;i++)
{
for(int j=i;j<=5;j++)
System.out.print("*");
for(int k=1;k<=(2*i-3);k++)
System.out.print("-");
for(int p=i;p<=5;p++)
{
if(p==1)
continue;
System.out.print("*");
}
System.out.println();
}
for(int i=2;i<=5;i++)
{
for(int j=1;j<=i;j++)
System.out.print("*");
for(int k=1;k<=(2*i-3);k++)
System.out.print("-");
for(int p=i;p<=5;p++)
{
if(p==1)
continue;
System.out.print("*");
}
System.out.println();
}
}
}