package Campus;

import java.util.BitSet;
import java.util.Scanner;

public class DecimalBinary {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the num");
			int i=sc.nextInt();
			sc.close();
			//BitSet b=sc.next(pattern)
			
			System.out.println("Binary representing of "+i+" = "+Integer.toBinaryString(i));
			//System.out.println("Bit repewsting of "+i+"="+Integer.to);
			System.out.println("Hexagonal representing of "+i+" = "+Integer.toHexString(i));
			System.out.println("Octagonal representing of "+i+" = "+Integer.toOctalString(i));
			System.out.println("Unisigned Long representing of "+i+" = "+Integer.toUnsignedLong(i));
			System.out.println("Highest ONe Bit representing of "+i+" = "+Integer.highestOneBit(i));
			
			String d=Integer.toBinaryString(i);
			int count=0;
			for(int j=1;j<d.length();j++)
			{	
				if(j==1)
				{
					count++;
				}
			}
			System.out.println(count);
			
	}

}
