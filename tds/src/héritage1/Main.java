
package héritage1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
   /*
	Test test = new Test();
	System.out.println(test.cpt);
	Test test1 = new Test();
	System.out.println(test1.cpt);
	
	test.siir=20.20;
	
	System.out.println(test.siir);
	
	System.out.println(test1.siir);
	*/
	
	ArrayList<filiere> tabfil = new ArrayList();
	ArrayList<Etudiant> tabetu = new ArrayList();
	
	Scanner scanner = new Scanner(System.in);	
	
	//filiere[] tabfil = new filiere[2];
	//Etudiant[] tabetu = new Etudiant[3];
	
	for(int i=0;i<2;i++)
    {
    	System.out.println("donner le code de la filiere "+(i+1)+":");        	
    	String code =scanner.nextLine();
    	
    	System.out.println("donner le libelle de la filiere "+(i+1)+":");        	
    	String libelle =scanner.nextLine();
    	
    	tabfil.add(new filiere(code,libelle));
    	//tabfil[i] = new filiere(code,libelle);
         
    	  
    	}
	
	    
	
		
	
	
	
	    
	
	// Créer un tableau de 3 objets Etudiant
	
	
	//int etudiantIndex = 0;

	for (int i = 0; i < 3; i++) {
	    System.out.println("Saisir les informations pour l'étudiant " + (i + 1));
	    System.out.print("Nom de l'étudiant : ");
	    String nom = scanner.next();
	    System.out.print("Prénom de l'étudiant : ");
	    String prenom = scanner.next();
	    System.out.print("Code de la filière de l'étudiant : ");
	    String codeFiliere = scanner.next();
           
	    // Recherche de la filière correspondante
	    filiere fi = null;
	    for (filiere Filiere : tabfil) {
	    	if (Filiere.Getcode().equals(codeFiliere)) {
	            fi = Filiere;
	            break;
	        }
	    }

	    if (fi == null) {
	        System.out.println("La filière avec le code " + codeFiliere + " n'existe pas.");
	    } else {
	        //tabetu[etudiantIndex] = new Etudiant(nom, prenom, fi);
	        tabetu.add(new Etudiant(nom,prenom,fi));
	        //etudiantIndex++;
	    }
	}
	

	
	
	
	

	System.out.println("saisir le code de la filiere à chercher: \n");
	scanner.nextLine();
	String fill =scanner.nextLine();
	
	System.out.println("la liste des etudiant inscrit dans cette filiere : ");
	for(Etudiant etudiant : tabetu)
		
	{
		if(etudiant.Getfilire().Getcode().equals(fill))
		{
			
			System.out.println(etudiant.Getnom()+" "+etudiant.Getprenom());
		}
		
	
	}
	

	
	
		
		
		
		
		
	
	
	}

}
