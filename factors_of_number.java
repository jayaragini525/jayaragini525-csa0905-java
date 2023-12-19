import java.util.Scanner;
class factors_of_number{
 public static void main(String[] args)
 {
 try{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter an number");
 int n=s.nextInt();
 int i,j,x=0;
 for(i=1;i<=n;i++)
 {
 if(n%i==0)
 {
 x=x+1;
 }
 }
 System.out.println("number of factors="+x);
 if(n<0)
 {
 for(i=-1;i>(n-1);i--)
 {
 if(n%i==0)
 {
 x=x+1;
 }
 }
 System.out.println("number of factors="+x);
 }
 }
 catch(Exception e)
 {
 System.out.println("Invalid"); 
 }
 
 }
}
