package NewProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatStringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		String s=sc.nextLine();
		String ch[]=s.split(" ");
		ArrayList<String> a=new ArrayList<>();
		for(int i=0;i<ch.length;i++)
		{
			a.add(ch[i]);
		}
		HashMap<String, Integer> m=new HashMap<String, Integer>();
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(a.get(i).equalsIgnoreCase(a.get(j)))
				{
					count++;
				}
				m.put(a.get(i), count);
			}
		}
		for(Map.Entry mm:m.entrySet())
		{
			System.out.println(mm.getKey()+"  "+mm.getValue());
		}

	}

}
