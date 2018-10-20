import java.lang.*;

import java.io.*;

import java.util.*;
class GFG
{
    
static Scanner sc=new Scanner(System.in);
    
    
static int getValue(char ch)
{
        
switch(ch)
{
            
case 'I':return 1;
            
case 'V':return 5;
            
case 'X':return 10;
            
case 'L':return 50;
            
case 'C':return 100;
            
case 'D':return 500;
            
case 'M':return 1000;
            
default:return 0;
        
}
    
}
    
	
public static void main (String[] args)
{
	       	    
    	   
String s=sc.nextLine();
    	    
int l=s.length();
    	    
int prev=50000;
    	    
int result=0;
    	    
for(int i=0;i<l;i++)
{
    	        
char ch=s.charAt(i);
    	       
int val=getValue(ch);
    	        
if(val > prev)
{    	            
result -= 2*prev;
    	        
}
    	        
result += val;
    	        
prev=val;
    	    
}
    	    
System.out.println(result);
	        
}

}