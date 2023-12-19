import java.util.*;
class athread extends Thread
{
public void run()
{
try{
for(int i=10;i<=0;i--)
{
System.out.println(" "+i);
Thread.sleep(1000);
}
}
catch(InterruptedException ex)
{
System.out.println(ex);
}
}
public static void main(String arg[])
{
athread p=new athread();
p.start();
}
}