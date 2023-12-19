import java.util.*;
class pascal{
public static void main(string arg[]){
Scanner s=new Scanner(System.in);
int num=6;
for(int i=0;i<num;i++){
for(int j=num-i;j>1;j--){
System.out.print("");
}
for(int j=0;j<=i;j++){
System.out.print("*");
}
System.out.println( );
}
}
}