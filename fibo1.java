import java.util.*;
class fibo1{
public static void main(String arg[])
{
int n;
long a=0,b=1;
long evenSum=0;
Scanner s=new Scanner(System.in);
System.out.println("enter valus of n:");
n=s.nextInt();
evenSum=findevensumoffibonacci(int);
System.out.println("Fibonacci series:"+evenSum);

for(int i=0;i<=n;i++)
{
if(i%2==0){
evenSum+=a;
}
long next=a+b;
a=b;
b=next;
}
}
}