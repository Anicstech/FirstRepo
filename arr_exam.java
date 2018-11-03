class arr_exam
{
public  static void main(String args[])
{
//Integer b = new Integer(10);
int a[][] = new int[3][];
int []var_name[] = {
                               {1,4,5},
		{2,3,4,5},
		{7,8} 
                            };
/*for(int a[]:var_name)
{
for(int a1:a)
	System.out.print(a1+"  ");
System.out.println("");
}*/
for(int i=0;i<a.length;i++)
{
     for(int j=0;j<a[i].length;j++)
	System.out.println(a[i][j]);
	System.out.println("");
}
//System.out.println(b);
} 
}