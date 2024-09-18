package g_magasin;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Magasin> magasins = new ArrayList<>();
		
		for(int i=0;i<2;i++)
		{  System.out.println("veuillez entrer l'id de magasin "+(i+1)+":");
		   int id = scanner.nextInt();		
		   magasins.add(new Magasin(id));
		}
		
		for(Magasin mag : magasins)
		{   System.out.println("le remplissage du magasin dont l'id est : "+(mag.id_m));
			mag.addproduit(2);
			
			
		}

		System.out.println("donner le id du magasin souhaiter pour visualiser les produits :");
		int x = scanner.nextInt();
		boolean etat=false; 
		for(Magasin mag : magasins)
		{
			
			if(mag.id_m==x)
			{
				
				mag.afficheproduit();
				System.out.println();
				System.out.println("le resulat(gain ou perte): "+mag.result());
				etat=true;
				break;
				
			
			}
			
		}
		
	if(!etat)
	{
		System.out.println("khooya had l magasin ma3ndnaach siir t9wd!");
	}
		
		
	}

}
