import java.util.Scanner;
class FindDAY {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 System.out.println("DATE=");
 int day=in.nextInt();
 System.out.println("MONTH=");
 int month=in.nextInt();
 System.out.println("YEAR=");
 int year=in.nextInt();
 //guass method
 double m;
 int y;
 int dow;
 m=(month-2+12)%12;
 if (month<=2){
 year--;}
 y=5*(year%4)+4*(year%100)+6*(year%400);
 dow=(day+(int)(2.6*m-0.2)+y)%7;
 switch (dow){
 case 0:
 System.out.println("Sunday");
 break;
 case 1:
 System.out.println("Monday");
 break;
 case 2:
 System.out.println("Tuesday");
 break;
 case 3:
 System.out.println("Wednesday");
 break;
 case 4:
 System.out.println("Thursday");
 break;
 case 5:
 System.out.println("Friday");
 break;
 case 6:
 System.out.println("Saturday");
 break;}
 }
 