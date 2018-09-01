package Campus;

import java.util.Scanner;

public class TranseverseNAdMultply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;
		int n=3;
		int[][]a=new int[m][n];	
		int[][]b=new int[m][n];	
		
		
		Scanner sc=new  Scanner(System.in);
		System.out.println("Matrrix A");
		for(int i=0;i< m;i++)
		{
			for(int j=0;j< n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		for(int i=0; i< m ;i++)
		{
			for(int j=0; j< n ;j++)
			{
				b[n][m]=a[m][n];	
			}
		}
		System.out.println();
		System.out.println("Trans");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				System.out.print(b[n][m]+"\t");
				
			}
		}
		
	
	}

}
