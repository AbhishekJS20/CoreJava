package Campus;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many num do want alter");
		int n=sc.nextInt();
		System.out.println("Ener num");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=1;i<=15;i++)
		{
			String s="";
			if(i%n1==0 && i%n2==0)
			{
				s="buzzfizz";
			}
			else if(i%n1==0)
			{
				s="fizz";
			}
			else if(i%n2==0)
			{
				s="buzz";
				
			}
			else if(i%n2!=0 && i%n1!=0)
			{
				System.out.println(i);
				
			}
			System.out.println(s);
		}
	}

}
