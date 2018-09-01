package Mindtree;

import java.util.Scanner;

class Encpt
{
	
	private String name;
	private int id;
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
}
public class Encptulation 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Encpt e=new Encpt();
		System.out.println("Enter Name ");
		String name=sc.nextLine();
		e.setName(name);
		System.out.println("Enter id");
		int id=sc.nextInt();
		e.setId(id);
		System.out.println("the name is "+e.getName()+"the id is "+e.getId());
		

	}

}
