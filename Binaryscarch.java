package Extra;

import java.util.Scanner;

public class Binaryscarch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,5,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		int fa=0;
		int la=a.length;
		System.out.println("******");
		int scarch=sc.nextInt();
		while(fa<la)
		{
			int mid=(fa+la)/2;
			if(scarch<mid)
				la=mid;
			else
				fa=mid;
			System.out.println(mid);
		}
	}

}
