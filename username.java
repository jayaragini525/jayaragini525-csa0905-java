import java.util.*;
class username{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a username");
String x,y;
x=s.nextLine();
System.out.println("ReEnter a username");
y=s.nextLine();
if(x.equals(y))
{
System.out.println("valid");
}
else
{
System.out.println("not valid");
}
}
}