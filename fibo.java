import java.util.*;
class fibo
{
int n,nt;
void getdetails(int x)
{
n=x;
}
void calculate()
{
int t1=0,t2=1;
nt=t1+t2;
System.out.println("fibo:"+t1);
System.out.println(t2);
for(int i=2;i<=n;i++)
{
nt=t1+t2;
t1=t2;
t2=nt;
System.out.println(+nt);
}
}
public static void main(String args[])
{
int m;
Scanner s=new Scanner(System.in);
System.out.println("enter fibo:");
m=s.nextInt();
fibo obj=new fibo();
obj.getdetails(m); 
obj.calculate();

}
}