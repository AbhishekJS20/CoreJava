package NewProgram;

import java.util.Scanner;

public class CheckAgeCitizen {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your age ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		AgeCitizen a=new AgeCitizen(age);
		try
		{
			a.vote(a);
		}
		catch (AgeHandleException e)
		{
			System.out.println("not Elegible try after "+e.getAge()+" years");
			e.printStackTrace();
		}
	}
}
class AgeCitizen
{
	int age;
	public AgeCitizen(int age) 
	{
		this.age=age;
	}
	public void vote(AgeCitizen person) throws AgeHandleException
	{
		if((person.age>=18))
		{
			System.out.println("Elegible for Vote");
		}
		else
		{
			int ageShort=18-person.age;
			throw new AgeHandleException(ageShort);
		}
	}
	
}
class AgeHandleException extends Exception
{
	int age;
	public AgeHandleException(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}


