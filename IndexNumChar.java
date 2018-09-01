package Campus;

public class IndexNumChar 
{
	public static void printEvenOddIndexes(String[] strings) {          
	    for (String word : strings) {

	        for (int i = 0; i < word.length(); i += 2) {
	            System.out.print(word.charAt(i));
	        }

	        System.out.print(" ");

	        for (int i = 1; i < word.length(); i += 2) {
	            System.out.print(word.charAt(i));
	        }

	        System.out.println();
	    }
	 }
}
