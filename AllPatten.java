package Mindtree;

import java.util.Scanner;

public class AllPatten 
{
	public void patten1()
	{
		int a=4;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==3 && i<5)
				{
					System.out.print(a);
					a--;
					
				}
				else
				{
					System.out.print("4");	
				}	
			}
			System.out.println();
		}
	}
	public void patten2()
	{
		int a=1;
		int b=9;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1 || i==4)
				{
					System.out.print(a+" ");
					a++;
				}
				else
				{
					System.out.print(b+" ");
					b++;
				}
			}
			System.out.println();
		}

	}
	
	public void patten3()
	{
		int a=1;
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(j==i-1)
				{
					System.out.print(a);
					a++;
				}
				else
				{
					System.out.print(a+"*");
					a++;
				}	
			}
			System.out.println();
		}
	}
	public void patten4()
	{
		int count=1,a=1,n=4;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=n;j++)
				{
					if(j!=n)
					{
						System.out.print(a);
						
					}
					else
					{
						System.out.print(++count);
					}
				}
				a+=2;
			}
			else
			{
				for(int k=0;k<=n;k++)
				{
					if(k==0)
					{
						System.out.print(++count);
						count--;
					}
					else
					{
						System.out.print(count);
					}
				}
				count+=1;
			}
			System.out.println();
		}
	}
	public void patten5()
	{
		int count=1,a=1,n=4;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=n;j++)
				{
					if(j!=n)
					{
						System.out.print(a);
						
					}
					else
					{
						System.out.print(++count);
					}
				}
				a+=2;
			}
			else
			{
				for(int k=0;k<=n;k++)
				{
					if(k==0)
					{
						System.out.print(++count);
						count--;
					}
					else
					{
						System.out.print(count);
					}
				}
				count+=1;
			}
			System.out.println();
		}
	}
	public void patten6()
	{
		int k=1,l=0;
		int m=0,e=0;
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j>0 && j<=i)
				
					System.out.print("*");
					System.out.print(k++);
					m=k;
					l=j;
			}
			System.out.println();
		}
		int c=m-l;
		int f=c;
		for(int i=0;i<n;i++)
		{
			c=f-1;
			for(int j=0;j<n-i;j++)
			{
				if(j>0 && j<=n-i)
				System.out.print("*");
				System.out.print(c++);
				e=j;
				if(j==0)
				{
					f=c;
				}
			}
			f=f-e;
			System.out.println();
		}

	}
	public void patten7()
	{
		int m=0;
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				m++;
			}
		}
		m++;
		for(int i=00;i<n;i++)
		{
			int k=0;
			for(int j=0;j<n-i;j++)
			{
				k++;
				
			}
			m=m-k;
			k=m;
			for(int j=0;j<n-i;j++)
			{
				System.out.print(k+++"");
			}
			System.out.println();
		}

	}
	public void patten8()
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(i-j+1);
			}
			System.out.println();
		}


	}
	public void patten9()
	{
		int n=5;
		int a=1,x=n;
		int s=(n*n)+1,w=(n*n)+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i+j)>=n+1)
				{
					if((i+j)==n+1)
					{
						System.out.print(" "+a++);
					}	
					else 
					System.out.print("*"+a+1);
				}
				else
				{
					System.out.print(" ");
				}
				for(int k=x;k>=1;k++)
				{
					if(i+k<=n+1)
					{
						System.out.print("*"+s++);
					}
				}
				w=w-(n-i);
				s=w;
				System.out.println();
			}
			
		}
	}
	public void patten10()
	{
		for (int i = 1; i <= 4; i++)
        {
            int n = 4;
 
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(l);
            }
 
            System.out.println();
        }
 
        for (int i = 3; i >= 1; i--)
        {
            int n = 3;
 
            for (int j = 0; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(l);
            }
 
            System.out.println();
        }
	}
	public void patten11()
	{
		 char[] letter = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
	                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
	                'W', 'X', 'Y', 'Z' };
	        int letter_number = 0;
	 
	        // array of strings
	        String[] diamond = new String[26];
	        // get the letter
	        System.out.print("Enter a Char between A to Z : ");
	 
	        Scanner reader = new Scanner(System.in);
	        try {
	            char user_letter = reader.next("[A-Z]").charAt(0);
	            // search for letter number in the array letter
	            for (int i = 0; i < letter.length; i++) {
	                if (letter[i] == user_letter) {
	                    letter_number = i;
	                    break;
	                }
	            }
	 
	            // construct diamond
	 
	            for (int i = 0; i <= letter_number; i++) {
	                diamond[i] = "";
	                // add initial spaces
	                for (int j = 0; j < letter_number - i; j++) {
	                    diamond[i] += " ";
	                }
	 
	                // add letter (first time)
	                diamond[i] += letter[i];
	 
	                // add space between letters
	                if (letter[i] != 'A') {
	                    for (int j = 0; j < 2 * i - 1; j++) {
	                        diamond[i] += " ";
	                    }
	                    // add letter (second time)
	                    diamond[i] += letter[i];
	                }
	                // Draw the first part of the diamond as it's composing.
	                System.out.println(diamond[i]);
	            }
	 
	            for (int i = letter_number - 1; i >= 0; i--) {
	                // Draw the second part of the diamond
	                // Writing the diamondArray in reverse order.
	                System.out.println(diamond[i]);
	            }
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } finally {
	            reader.close();
	        }
	}
	public void patten12()
	{
		 int n = 5;
		 
	        for (int i = n; i >= 0; i--) {
	            for (int j = 1; j <= i; j++)
	                System.out.print(j);
	            System.out.println();
	        }
	 
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++)
	                System.out.print(j);
	            System.out.println();
	        }
	 
	        System.out.println();
	}
	public void patten13()
	{
		int n, p, q;
        
        n = 5;
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
            { 
            	p = 1; q = 0; 
            	}
            else
            { 
            	p = 0; q = 1; 
            	}
            for (int j = 1; j <= i; j++)
                if (j % 2 == 0)
                    System.out.print(p);
                else
                    System.out.print(q);
            System.out.println();
 
        }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice");
		AllPatten a=new AllPatten();
		System.out.println("Num 1");
		System.out.println("44444\r\n" + 
				"44344\r\n" + 
				"44244\r\n" + 
				"44144\r\n" + 
				"44444");
		System.out.println();
		System.out.println("Num 2");
		System.out.println("1 2 3 4 \r\n" + 
				"9 10 11 12 \r\n" + 
				"13 14 15 16 \r\n" + 
				"5 6 7 8 \r\n" + 
				"");
		System.out.println("Num 3");
		System.out.println("1\r\n" + 
				"2*3\r\n" + 
				"4*5*6\r\n" + 
				"7*8*9*10\r\n" + 
				"");
		System.out.println("Num 4");
		System.out.println("1 \r\n" + 
				"3 *2 \r\n" + 
				"4 *5 *6 \r\n" + 
				"10 *9 *8 *7 \r\n" + 
				"11 *12 *13 *14 *15 \r\n" + 
				"");
		
		System.out.println("Num 5");
		System.out.println("1112\r\n" + 
				"32222\r\n" + 
				"3334\r\n" + 
				"54444\r\n" + 
				"");
		System.out.println("Num 6");
		System.out.println("1\r\n" + 
				"2*3\r\n" + 
				"4*5*6\r\n" + 
				"7*8*9*10\r\n" + 
				"11*12*13*14*15\r\n" + 
				"11*12*13*14*15\r\n" + 
				"7*8*9*10\r\n" + 
				"4*5*6\r\n" + 
				"2*3\r\n" + 
				"1\r\n" + 
				"");
		System.out.println("Num 7");
		System.out.println("78910\r\n" + 
				"456\r\n" + 
				"23\r\n" + 
				"1\r\n" + 
				"");
		System.out.println("Num 8");
		System.out.println("     1\r\n" + 
				"    21\r\n" + 
				"   321\r\n" + 
				"  4321\r\n" + 
				" 54321\r\n" + 
				"");
		
		System.out.println("Num 9");
		System.out.println("Unstable");
		System.out.println("Num 10");
		System.out.println("   1\r\n" + 
				"  212\r\n" + 
				" 32123\r\n" + 
				"4321234\r\n" + 
				" 32123\r\n" + 
				"  212\r\n" + 
				"   1\r\n" + 
				"");
		System.out.println("Num 11");
		System.out.println("    A\r\n" + 
				"   B B\r\n" + 
				"  C   C\r\n" + 
				" D     D\r\n" + 
				"E       E\r\n" + 
				" D     D\r\n" + 
				"  C   C\r\n" + 
				"   B B\r\n" + 
				"    A\r\n" + 
				"");
		System.out.println("Num 12");
		System.out.println("12345\r\n" + 
				"1234\r\n" + 
				"123\r\n" + 
				"12\r\n" + 
				"1\r\n" + 
				"\r\n" + 
				"1\r\n" + 
				"12\r\n" + 
				"123\r\n" + 
				"1234\r\n" + 
				"12345\r\n" + 
				"\r\n" + 
				"");
		System.out.println("Num 13");
		System.out.println("1\r\n" + 
				"01\r\n" + 
				"101\r\n" + 
				"0101\r\n" + 
				"10101\r\n" + 
				"");
		while(true)
		{	
			int input=sc.nextInt();
			
			switch (input) 
			{
			case 1:
				a.patten1();
				break;
			case 2:
				a.patten2();
				break;
			case 3:
				a.patten3();
				break;
			case 4:
				a.patten4();
				break;
			case 5:
				a.patten5();
				break;
			case 6:
				a.patten6();
				break;
			case 7:
				a.patten7();
				break;
			case 8:
				a.patten8();
				break;
			/*case 9:
				a.patten9();
				break;*/
			case 10:
				a.patten10();
				break;
			case 11:
				a.patten11();
				break;
			case 12:
				a.patten12();
				break;
			case 13:
				a.patten13();
				break;
				
			default:
				break;
			}
			
		}
		
	}
	

}
