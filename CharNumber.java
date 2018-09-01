package NewProgram;

public class CharNumber 
{
	//find out which is char, spicial char, num from a given string
	public static void main(String[] args) 
	{
		String s="abhi3@r32i iughisduf iohdof54622@#@";
		for(int i=0;i<s.length();i++)
		{
			boolean status=Character.isDigit(s.charAt(i));
			boolean status1=Character.isAlphabetic(s.charAt(i));
			if(status)
			{
				System.out.println(s.charAt(i)+"--Is a number");
			}
			else if(status1)
			{
				System.out.println(s.charAt(i)+"--Is a Char");
			}
			else if(Character.isSpace(s.charAt(i)))
			{
				System.out.println(s.charAt(i)+"--Is a Space");
			}
			else
			{
				System.out.println(s.charAt(i)+"--Is a Spicial Char");

			}
		}
	}
}
