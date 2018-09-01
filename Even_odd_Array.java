package Campus;

import java.util.Scanner;

public class Even_odd_Array {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter Element in the array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element");
		 for (int i = 0; i < n; i++) 
	        {
	            a[i] = sc.nextInt();
	        }
		System.out.println("Even Num is ");
		for(int j=0;j<n;j++)
		{
			if(a[j]%2==0)
			{
				System.out.print(a[j]+" ");
			}
		}
		System.out.println("");
		System.out.println("Odd Num is ");
		for(int j=0;j<n;j++)
		{
			if(a[j]%2!=0)
			{
				System.out.print(a[j]+" ");
			}
		}
	}

}
