package HackerRank;

import java.util.Scanner;

public class DataType 
{
	public static void main(String []args)
	    {
	        
			Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	                long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
	                if(x>=-128 && x<=127)
	                	{
	                	System.out.println("* byte");
	                	}
	            // else if(x>=32768 && x<=32767) 
	                
	            }
	            finally 
                { System.out.println("the coad is ");
						
					}
	            try {
	            	long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
 	            	if(x>=32768 && x<=32767)
 	                {
 	                	System.out.println("* short");
 	                }
 	            	System.out.println();
 	            	
             	}
	            
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }
	            }
	        }
}      
	   