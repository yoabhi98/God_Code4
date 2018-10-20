import java.util.*;
public class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
StringBuffer rev=new StringBuffer(str);
rev.reverse();
System.out.println(rev);
}
}