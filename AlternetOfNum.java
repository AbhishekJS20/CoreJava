package Campus;

import java.util.Scanner;

public class AlternetOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num ");
		int n=sc.nextInt();
		int r=0,m;
		while(n!=0)
		{		
			m=n%10;
			//System.out.println(m);
			r=r*10+m;
			n=n/10;
			n=n/10;		
		}
		
		//System.out.println(r);
		System.out.println("***************");
		int alternate=0;
		while(r!=0)
		{
			alternate=r%10;
			System.out.println(alternate);
			r=r/10;
		}
	}
}