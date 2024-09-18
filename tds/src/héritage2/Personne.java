package héritage2;

public  class Personne {
	public String nom; 
	public String prenom; 
	public String rue; 
	public String ville;
	public static int nbpersonnes;
	
	Personne(String nom, String prenom, String rue, String ville)
	{ 
		this.nom=nom;
		this.prenom=prenom;
		this.rue=rue;
		this.ville=ville;		
	    nbpersonnes++;	
	}
    
	public String toString()
	{
		
		return "Person[nom = "+this.nom+" , prenom = "+this.prenom+"]";
		
	}
	
	
	
	public void ecrirepersonne()
	{System.out.println("hello i'm the father who asking!");}
	
	public static void nbpersonne()
	{  
	  
	  System.out.println("le nombre de secretaire: "+Secretaire.fnsecretaire()); // car le retourner de cette fct est static
	  System.out.println("le nombre d'ensegniant: "+Enseignant.fnbenseignant()); //depend de la classe et pas d'object.
	  System.out.println("le nombre d'etudiant: "+Etudiant.fnnbetudiantb());
	  System.out.println("le nombre de personne: "+nbpersonnes);
      
	  
	   	
		
	}
	
	
	public void modifierperso(String rue, String ville)
	{
		this.rue=rue;
		this.ville=ville;
		
	}
	
	Personne(){nbpersonnes++;	}	
	
	
	

}
