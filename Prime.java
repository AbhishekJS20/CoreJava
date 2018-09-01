import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args) 
	{
		
		int count =0;
		for(int i =1; i<=100 ;i++)
		{
			for(int j =1 ; j<=100; j++)
			{
				if(i%j==0)
					count++;
			}
			if(count ==2)
			{
				System.out.println(i+"\tits a prime");
			}
			else
			{
				System.out.println(i+"\tits not a prime");
			}

		}
			
		
	}
}
