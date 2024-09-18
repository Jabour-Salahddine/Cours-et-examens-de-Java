package héritage2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Personne personne1 = new Etudiant("jabour","salah", "yes!", "settat","licence");//on à l'acce juste 
	Personne personne2 = new Enseignant("jab","sal", "no!", "rabat","informatique");//à les elemnets 
	Personne personne3 = new Secretaire("bour","lah", "okey!", "ouarzazat","AII2");//de la classe Personne
	
	//Personne personne4 = new Etudiant();
	
	Etudiant personne5 = new Etudiant("our","ah", "yep!", "settat","master");//on a l'acce à les elements de la classe derivé et la classe mere   
	
	
	personne1.ecrirepersonne();
	personne2.ecrirepersonne();   // la notion de polymorphisme heritage.
	personne3.ecrirepersonne();
	
	Personne ok = personne5;
	
	ok.ecrirepersonne();
	
	System.out.println();
	
	personne1.nbpersonne();  // warning : The static method nbpersonne() from the type Personne should be accessed in a static way
	
	System.out.println();
	
	Personne.nbpersonne();  // methode plus correcte sans le warning!
	
	/* puisque on a fait l'instantiation à partir de la class Personne (héritage). les objets on 
	 l'accessibilité juste aux methodes et attributs de la classe Personne.
	 
	  les methodes et les attributs de constructeurs sont exclus.
	 
	  */
	
	
	
	
	}

}
