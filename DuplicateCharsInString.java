package NewProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharsInString
{
	public Map<Character, Integer> findDuplicateCharsInString(String str)
	{
		Map<Character, Integer> map=new HashMap<Character,Integer>();
		char[] chrs=str.toCharArray();
		for(Character ch : chrs)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				map.put(ch, map.get(ch)+1);
			}
		}
		Set<Character> keys=map.keySet();
		for(Character ch : keys)
		{
			if(map.get(ch) >1)
			{
				System.out.println(ch +"----"+map.get(ch));
			}
		}
		return map;
	}
	public Map<Character, Integer> remove(Map<Character, Integer>map)
	{
		Set<Character> keys=map.keySet();
		System.out.println(".............");
		Map<Character, Integer> map1 =new HashMap<Character,Integer>();
		for (Character ch : keys) {
			if (map.get(ch) != 1) {
				map1.put(ch, map.get(ch));
				 System.out.println(ch+"--->"+map.get(ch));
				 System.out.println(ch);
			}
		}
		return map1;
	}
	public void display(Map<Character, Integer> map) 
	{
		System.out.println("-------------------");
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-----" + entry.getValue());
		}
	}
	public static void main(String a[] ) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		DuplicateCharsInString d=new DuplicateCharsInString();
		Map<Character, Integer> map=d.findDuplicateCharsInString(s);
		System.out.println(map);
		d.display(map);
	}
}