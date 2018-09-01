//Write a program to reverse a string using recursive algorithm
package Campus;

public class ReverseStringAlgorthom
{
	public String reverse(String str)
	{
		if((str==null)||(str.length()<=1 ))
		return str;
		return reverse(str.substring(1))+str.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStringAlgorthom r=new ReverseStringAlgorthom();
		String str="Abhishek";
		r.reverse(str);
		System.out.println(r.reverse(str));
		
	}

}
