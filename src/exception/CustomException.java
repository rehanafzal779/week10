package exception;

public class CustomException 
{
public static void ValidateAge(int age) throws invalidageexception
{
	if (age < 18)
	{
		throw new invalidageexception("age must be atleast 18");
		
	}
}
	public static void main(String[] args) 
	{
		try 
		{
			ValidateAge(16);
		}
		catch(invalidageexception e)
		{
			System.out.println("caught custom exception : "+e.getMessage());
		}

	}

}

