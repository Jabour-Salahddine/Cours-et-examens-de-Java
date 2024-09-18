package tests;

public class Grifo {

	void remplir(int []T)
	{
		int i;
		for(i=0;i<T.length;i++)
		{
			T[i]=i*i;
		}
		
		
	}
	
	public static void afficher(int []T)
	{
		
		for(int i=0;i<T.length;i++)
		{
			System.out.println(T[i]);
		}
		
	}
	
	
	
}
