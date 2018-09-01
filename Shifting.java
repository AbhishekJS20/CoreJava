package Campus;

public class Shifting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		
		for(int i=0,q=0;i<a.length;i++)
		{
			int e=a[a.length-1];
			
			if(a[i]==0)
			{
				
				
				a[i]=e;
			}
			if(i==a.length-1)
			{
				a[i]=q;
				break;
			}
			a[i]=a[i+1];
			/*else
			{
				a[i]=q;
				q=a[i+1];
				a[i+1]=q;
			}*/
			/*if(a[i]==0)
			{
				break;
			}*/
			
			System.out.print(" "+a[i]);
			
			
			
			
/*//			for(int j=i;j<a.length;j++)
//			{
				if(a[i]==null)
				{
					a[i]=a[a.length];
				}
				else
				
			{
					int temp=0;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			//}
			
		*/}
	
	}

}
