package Mindtree;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I love Java";
		String []c=s.split(" ");
		String rev = "";
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i]+" ";
			
		}
		System.out.println(rev);
	}

}
