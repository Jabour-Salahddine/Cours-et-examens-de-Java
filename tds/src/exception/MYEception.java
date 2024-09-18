package exception;

public class MYEception extends Exception {
	
	public MYEception(String message)
	{
		super(message);
		
	}


	public static void validateage(int age) throws MYEception
	{
		if(age<0)
		{
			
			throw new MYEception("age is negatif!");
			
		}
		
		else 
		{
			System.out.println("ok c est validé!");
		}
	    

	} 



}
