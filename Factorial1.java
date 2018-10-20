import java.util.*;
public class Factorial1
{
public static void main(String args[])
{
int fact=1;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
while(num>0)
{
fact*=num;
num--;
}
System.out.println(fact);
}
}