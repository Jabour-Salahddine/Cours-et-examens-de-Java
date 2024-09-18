package threads;

public class compte {

	public static int solde;
	public compte(int somme)
	{
		solde=somme;		
	}
	
	public static synchronized void deposer(int somme)
	{
	  	
		solde+=somme;
	}
	
	public int getsolde()
	{
		
		return this.solde;
	}
	
	
	
}






