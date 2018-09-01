package Campus;

public class SecondLargestNum
{
	public static int getsecond(int[]a,int total)
	{
	int temp;
	
	for(int i=0;i<total;i++)
	{
		for(int j=i+1;j<total;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	return a[total-2];
	}
	public static void main(String[] args)
	{
		int[] a= {1,8,9,85,88,56,25,14,100};
		int total=a.length;
		System.out.println(getsecond(a, total));
	}

}
