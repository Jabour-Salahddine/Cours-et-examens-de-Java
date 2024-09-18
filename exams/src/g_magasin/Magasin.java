package g_magasin;

import java.util.Scanner;

public class Magasin {
protected int id_m;
protected int entrees; // gain=prix_vente*qtité
protected int sorties;//perte=prix_achat*qtité
Produits[] produits = new Produits[5];
Scanner scanner = new Scanner(System.in);

public Magasin(int id)
{ 
	
  
  id_m=id;
		  
  
 
}

public Produits createproduit()
{  
   System.out.println("donner le nom de produit à ajouter : ");
   String nom = scanner.nextLine();
   System.out.println("donner le prix_achat de produit à ajouter : ");
   int prix_achat=scanner.nextInt();
   System.out.println("donner le prix_vente de produit à ajouter : ");
   int prix_vente = scanner.nextInt();
   System.out.println("donner la qantité de produit à ajouter : ");
   int stock = scanner.nextInt();
   
   Produits p1 = new Produits(nom,prix_vente,prix_achat,stock);
   return p1;
	
}

public void addproduit(int n)
{
	//Produits p1 = new Produits();
	
	for(int i=0;i<n;i++)
	{   
		produits[i]=createproduit();
		this.entrees+=produits[i].get_prix_vente()*produits[i].get_stock();
		this.sorties+=produits[i].get_prix_achat()*produits[i].get_stock();
		scanner.nextLine();
		
		
	}


}


public void afficheproduit()
{  System.out.println("tou les produits dans notre magasin : ");
  	for(Produits pro : produits)
  	{  if(pro!=null)
  	{
  		System.out.println("id_produit:"+pro.get_id()+" , nom: "+pro.nom+" ,prix_achat: "+pro.prix_achat+" ,prix_vente: "+pro.prix_vente+" ,stock: "+pro.stock);
  	}	
  	}

}

public void acheter_produit(int numero,int qtt)
{   boolean etat=false;
	for(Produits pro : produits)
	{
		if(pro.get_id()==numero);
		{
          System.out.println("le produit "+pro.nom+" est acheté avec une qtt de "+qtt);			
		  pro.stock=pro.stock+qtt;
		  etat=true;
		  break;
		}
		
	}
	
	if(!etat)
	{
		System.out.println("machrinach had lproduit!");
	}
}


public void vendre_produit(int numero,int qtt)
{   boolean etat=false;
	for(Produits pro : produits)
	{
		if(pro.id_produit==numero);
		{
          System.out.println("le produit "+pro.nom+" est vendu avec une qtt de "+qtt);			
		  pro.stock=pro.stock-qtt;
		  etat=true;
		  break;
		}
		
	}
	
	if(!etat)
	{
		System.out.println("mabriitch nbii3! ghyrha...");
	}
	
}

public int result()
{  
	return this.sorties-this.entrees; // ce n'est pas le resultat d'une seul affaire mais c'est le resultat generale du magasin
  
}




	
}


