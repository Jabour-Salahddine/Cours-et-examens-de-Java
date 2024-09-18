package héritage2;

public class Secretaire extends Personne {
public String numerobureau;
public static int nbsecretaire;

Secretaire(String nom, String prenom, String rue, String ville, String numerobureau)
{   
	   super(nom,prenom,rue,ville);
	   this.numerobureau=numerobureau;
	   nbsecretaire++;
			   
 }                           

     // to String 

public String toString()
{
	
	return "Secretaire[nom = "+this.nom+" , prenom = "+this.prenom+"]";

}


//l'implimentation de la methode abstraite:// sans cette etape on ne peut pas faire l'héritage:

	public void ecrirepersonne()
	{
		System.out.println("je suis un(e) secretaire");
		
		
	}
	
	
	
	// methode qui retourn le nombres de secretaire:

	public static int fnsecretaire()
{
	
    return nbsecretaire;

}
     // constructeur où cas on veut travailler sans argument:
	
	Secretaire(){nbsecretaire++;}
	
	
	
	
}
