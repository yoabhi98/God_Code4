import java.util.*;
class Iso
{
    public static void main (String[] args) 
    {
    	Scanner scan=new Scanner(System.in);
    
    		int flag=1;
        String str1=scan.next();
        String str2=scan.next();
        Map<Character, Integer> map1 = new HashMap<>();
    	Map<Character, Integer> map2 = new HashMap<>();
    	for(int i = 0; i < str1.length(); i++)
    	{
    		Integer s1Prv=map1.put(str1.charAt(i), i);
    		Integer s2Prv=map2.put(str2.charAt(i), i);
    		
    		if(s1Prv != s2Prv) 
    		{
    		flag=0;
    		}
    	}
    	if(flag==0)
    		System.out.println("no");
    	else
    		System.out.println("yes");
    	
    	
        
    	}
    }
    
    
    
