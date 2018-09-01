package Campus;

import java.util.Scanner;

public class DictnaryOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num ");
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(str[i].compareTo(str[j])>1)
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;	
				}
			}
		}
		System.out.println("output");
		for(int i=0;i<n-1;i++)
		{
			System.out.println(str[i]);
		}
		System.out.println(str[n-1]);
	}
}