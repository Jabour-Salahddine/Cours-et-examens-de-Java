package héritage2;

public class Etudiant extends Personne {
    public String diplomeencours;
    public static int nbetudiants;
	
     // constrctor
	Etudiant(String nom, String prenom, String rue, String ville, String diplome)
	{
		super(nom,prenom,rue,ville);
		this.diplomeencours=diplome;
		nbetudiants++;
		
     }
	
	     
	public String toString()
	{   
		
		// on peut utiliser : return super.toString();
		// + bien sur le diplomeencour si on veut
		
		return "Etudiant[nom = "+this.nom+" , prenom = "+this.prenom+"]";
		
	}
	
// l'implimentation de la methode abstraite:// sans cette etape on ne peut pas faire l'héritage:
	
	public void ecrirepersonne()
	{
		System.out.println("je suis un etudiant");
		
		
	}
	  
	// methode qui retourn le nombres d'etudiants:

	public static int fnnbetudiantb()
{
	
    return nbetudiants;

}
  	
	
	//Etudiant(){nbetudiants++;}
	
	
	
	
	
	
}
