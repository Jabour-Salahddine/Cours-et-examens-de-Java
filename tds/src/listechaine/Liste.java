package listechaine;

public class Liste {
int contenu;
Liste suivant;

Liste(int x, Liste a)
{  
   this.contenu = x;
   this.suivant=a;	

}


/*
public static Liste Liste_vide()
{  return null;
 
}


public boolean est_vide(Liste a)
{
	if(a!=null)
		return false;    // return a==null
	else
		return true; 

}



public static Liste ajouter(int x, Liste a)
{  
	Liste nv = new Liste(x,null);
	
	if(a==null)
	{
		a=nv;
	}
	else
	{  Liste courant = a;
	   while(courant.suivant!=null)
	   {
		   courant=courant.suivant;
	   }
		
	   courant.suivant=nv;
	  
		
	}
 
    return a;
}


public static Liste remplir(int n)
{  Liste ajou = new Liste(0,null); 
   for(int i=0 ; i<n ;i++)
   {
	   ajou= ajouter(i,ajou);
   }
	
   return ajou;
}


public static boolean recherche(int x, Liste a)
{
	


}


public static void afficher(Liste a)
{}
*/




       //ajout 
public static Liste ajouter(int x, Liste a)
{
   return new Liste(x,a);	
}

      //remplissage:

public static Liste remplir(int n)
{
	Liste ajou = new Liste(0,null); 
	   for(int i=0 ; i<n ;i++)
	   {
		   ajou= ajouter(i,ajou);
	   }
		
	   return ajou;

}


           //affichage
public static void afficher(Liste a)
{ 
	Liste b =a;
	while(b.suivant!=null)
	{ System.out.println(b.contenu);
	  b=b.suivant;
	}
  	
	System.out.println(b.contenu);

}







}
