package exception;

public class basicexceptionstructure 
{
	public static void main(String[] args)
	{
	try 
	{
		int[] numbers = {1,2,3};
		System.out.println(numbers[3]);
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("array index is out of bound");
	}
	finally 
	{
		System.out.println("this block always executes");
	}


	}
}

