package Campus;

import java.util.Scanner;

public class String_to_Num {
	
	public static int strToNum(String num)
	{
		char ch[]=num.toCharArray();
		int sum=0;
		int zero = (int)'0';
		for(char c :ch)
		{
			int tempi=(int)c;
			sum=sum*10+(tempi-zero);
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		String num=sc.nextLine();
		System.out.println("the output is "+strToNum(num));

	}

}
