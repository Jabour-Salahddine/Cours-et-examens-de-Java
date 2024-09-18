package héritage2;

public class Enseignant extends Personne {

	public String specialite;
	public static int nbenseignant;
	
	Enseignant(String nom, String prenom, String rue, String ville, String specialite)
	{  
		super(nom,prenom,rue,ville);
		this.specialite=specialite;
		nbenseignant++;
		
	}
	
	public String toString()
	{
		// on peut utiliser : return super.toString();
		// + bien sur le specialite si on veut
		
		return "Enseignnat[nom = "+this.nom+" , prenom = "+this.prenom+"]";
		
	}
	
	//l'implimentation de la methode abstraite:// sans cette etape on ne peut pas faire l'héritage:
	
	public void ecrirepersonne()
	{
		System.out.println("je suis un ensiegnant");
		
		
	}
	
	     // methode qui retourn le nombre d'enseignanant:
	
	public static int fnbenseignant()
	{
		
	    return nbenseignant;

	}
	
	
	
	
	//Enseignant(){nbenseignant++;}
	
	
	
	
	
}
