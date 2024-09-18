package g_banque;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBanque {

	public static void main(String[] args) {
		ArrayList<Banque> listeBanque = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<2;i++)
		{ System.out.println("veuillez donner un id au banque "+(i+1)+" à ajoutre : ");
		  int id=scanner.nextInt();
		  listeBanque.add(new Banque(id));			
			
		}

		for(Banque banq : listeBanque)
		{   //ça va permet d'ajouter un seul clients dans chque banque!
			
			System.out.println("le remplissage du magasin dont l'id est : "+(banq.id_banque));
			System.out.println();
			System.out.println("donner le nom de proprietaire : ");
		    String nom =scanner.nextLine();
			System.out.println("le montant: ");
			int montant = scanner.nextInt();
			banq.ajouter_compte(nom, montant);
    			
		}
		
		
		
	}

}
