import java.applet.Applet;
import java.awt.*;
public class MyApplet extends Applet
{
String name;
MyApplet1 my1 = new MyApplet1();
public void init()
{
/*Runs only once at the time of intialization only*/
name = "ashu";
/*if(this INSTANCEOF Applet)
{
 name = "ashu";
}
else
{
  name= "garg";
}*/

}
public void start()
{
   name="to be changed";
}
public void stop()
{
     name ="stop";
}   
 public void paint(Graphics g)
{
int a=10;
   

    g.drawString(name,34,43);
    g.drawLine(50,50,200,200);



}
}
/*class faltu extends Applet
{
  public void paint(Graphics g)
{
    g.drawString("that it",34,43);
    g.drawLine(50,50,200,200);
}*/
//}