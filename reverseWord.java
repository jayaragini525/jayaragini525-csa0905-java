import java.util.*;
class reverseWord{
 public static void main(String arg[])
{
 Scanner s=new Scanner(System.in);
System.out.println("Enter word:");
String input=s.nextLine();
String reversed=reverseWord(input);
System.out.println("Reverse String:"+reversed);
}
public static String reverseWord(String input)
{
char[]inputArray=input.toCharArray();
int length=inputArray.length;
char[]reversedArray=new char[length];
for(int i=0;i<length;i++)
{
reversedArray[i]=inputArray[length-1-i];
}
 return new String(reversedArray);
}
}