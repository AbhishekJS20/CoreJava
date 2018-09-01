package Sotting;

public class BobbleSotting {
	public void sott(int a[])
	{
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				if(a[j]>a[i])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}			
			}	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8,9,78,2,3,5};
		BobbleSotting b=new BobbleSotting();
		b.sott(a);
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]+"");
		}
		System.out.println("****");
	}

}
