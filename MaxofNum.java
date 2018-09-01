package Campus;

public class MaxofNum 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n=154875;
		int r=0,m;
		
		while(n!=0)
		{	
			m=n%10;
			if(r<m)
			{
				r=m;
			}
			n=n/10;
		}
		System.out.println(r);
	}
}