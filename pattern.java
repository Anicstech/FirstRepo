class pattern
{
public static void main(String args[])
{
int i,j;
for(i=1;i<=4;i++)
{
for(j=i;j<4;j++)
{
System.out.print("-");
}
System.out.print("*");
for(int k=1;k<=(2*i-3);k++)
System.out.print("-");
if(i>1)
System.out.print("*");
System.out.println();
}
for(i=3;i>=1;i--)
{
for(j=i;j<=3;j++)
{
System.out.print("-");
}
System.out.print("*");
for(int k=1;k<=(2*i-3);k++)
System.out.print("-");
if(i>1)
System.out.print("*");
System.out.println();
}
}
}