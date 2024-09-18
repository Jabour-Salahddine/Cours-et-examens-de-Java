package threads;

public class Thread_compte extends Thread {
    
	compte B = new compte(0);
	public Thread_compte(compte B)
	{
		this.B=B;
	}
	
	public void run()
	{
		int x = B.getsolde()*10;
		B.deposer(x);
		System.out.println("solde = "+B.getsolde());
		
	}
	
	
}








