import java.util.*;
class PyramidPattern  
{    
public static void main(String args[])   
{     
int i, j, row = 6;       
for (i=1; i<=row; i++)   
{    
for (j=1; j<=i; j++ )   
{       
System.out.print(i+" ");   
}    
System.out.println();   
}   
for (i=row-1; i>0; i--)   
{    
for (j=1; j<=i; j++ )   
{       
System.out.print(i+" ");   
}    
System.out.println();   
}   
}   
}