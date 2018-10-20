import java.util.*;
public class Camel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String[] words=str.split("\\s");
for(String w:words)
{ 
String str1=w.substring(0,1).toUpperCase()+w.substring(1,w.length());
System.out.print(str1+" ");
}}
}