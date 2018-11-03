class A
{
int a=10;
int b;
void go()
{
    System.out.println("this is in class a");
}
}
class B extends A          //default constructor of class A call itself .First control is passed to the base class constructor
{
int c,d;
void display()
{
System.out.println("this is in class B");
}
public static void main(String args[])
{
 B b1 = new B();
System.out.println(b1.a);   
System.out.println(b1.b);
System.out.println(b1.c);
System.out.println(b1.d);
}
}