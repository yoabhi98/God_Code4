import java.util.*;
public class Abhi10
{

     
public static void main(String []args)
{
 
int fact=5;            
Scanner sc=new Scanner(System.in);

int num = sc.nextInt();    
while(fact>0)
{
if(num%5==0)
{
System.out.print(num+" ");
num++;
}
fact--;
}
}
}