package Campus;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=1;j<=10;j++)
		{
			int fact=1;
			for(int i=1;i<=j;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factrioal Of the Given Num Is "+fact);
		}
	}
}
