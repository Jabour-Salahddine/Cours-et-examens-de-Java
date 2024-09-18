package tests;

public class Main {
    
	
	
	/*//ici
	
	
	public static void remplirr(int []T)
	{
		
		for(int j=0;j<T.length;j++)
		{
			T[j]=j*j;
		}
	}
	
	public static void afficher(int []T)
	{
		
		for(int i=0;i<T.length;i++)
		{
			System.out.println(T[i]);
		}
		
	}
	
	*///ici
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		/*//ici
	Grifo grifo = new Grifo();
	int []CH= new int[4];
	grifo.remplir(CH);
	grifo.afficher(CH);
	
	System.out.println();
		
		Main autre = new Main();
		int []V= new int[4];
		
		autre.remplirr(V);
		autre.afficher(V);
		
		System.out.println();
		
		int []T= new int[4];
		
		remplirr(T);
		afficher(T);
		
// dans la methode "static main" il faut appler des methodes qui sont static static.
// c est vrai que dans les exercices deja faites on utilise des methodes non static dans la methode main
//mais c est à travres des objets. soit on declare les objets dans la meme class où ona la methode "main"
//soit on les declare dans une autre class(comme ce qu'on fait souvant).		
	
		*/ //ici
		
	
		 System.out.println(testMethod());	
		
		
		
	
	}

	
	public static int testMethod() {
		
        try {
            int x = Integer.parseInt("salah");
            System.out.println("Dans le bloc ");
            return 10;
        } 
       
        catch (Exception e) {
            System.out.println("Dans le bloc catch");
             
        } 
        
        finally {
        	
        	System.out.println("Dans le bloc finally");
           
        }
        
        System.out.println("Dan");
        return 12;
        
        
        
        
        
    }
	
	
	
	
	
}







