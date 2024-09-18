package g_banque;

import java.util.ArrayList;
import java.util.Scanner;

public class Banque {
Scanner scanner = new Scanner(System.in);
private int derniernumero;
private ArrayList<Compte> listeCompte = new ArrayList<>();

public int ajouter_compte(String nom,int montant)
{   int x=0; //echec
    System.out.println("veuillez entrer un id pour le compte : ");
    int id_compte=scanner.nextInt();  
	if(listeCompte.add(new Compte(nom,id_compte,montant)))
	{
	  System.out.println("le compte dont l'id est "+id_compte+" été ajouté!");	
      return id_compte;	 
    }

if(x==0)
{
  System.out.println("echec!");	
 
  
}
return x;

}

// lister ==affichage

public void lister()
{  // afficher tout les comptes dans une banque: fuck assahbii ex mamfhoumch na9ssin fiih hwiiyjat s3bha 3la bnadm bhaka
	

 System.out.println("la liste de tout les compte dans notre banque : ");
 for(Compte comp : listeCompte)
 {  if(comp!=null)
 {	 
	System.out.println("numero "+comp.get_numero()+" proprietaire: "+comp.get_proprietaire()+" montant: "+comp.get_montant()); 
 }
 	
 }
	
}


public Compte chercher_compte(int numero)
{  Compte com=null;
   for(Compte comp : listeCompte)
   {
	   if(comp.get_numero()==numero)
	   {
		   System.out.println("l'element trouve!");
		   com=comp;
		   break;
	   }
	   
   }
if(com==null)
{
   System.out.println("element non trouver!");
}
return com;   

}

public boolean supprivercompte(int numero)
{
	boolean x=false;
	   for(Compte comp : listeCompte)
	   {
		   if(comp.get_numero()==numero)
		   {
			   System.out.println("l'element trouve!, suppression...");
			   listeCompte.remove(comp);
			   x=true;
			   break;
		   }
		   
	   }
	if(!x)
	{
	   System.out.println("eche!...");
	}
	return x;   	

}

public void modifier_compte(int numero,int somme)
{  int x=0;
   for(Compte comp : listeCompte)
   {
	   if(comp.get_numero()==numero)
	   {
		   comp.modifier_montant(somme);
		   System.out.println("l3aa9aa dkhlaat am3lm! arak lzhoo!");
		   x=1;
		   break;
	   }
	   
	   
   }

if(x==0)
{
  System.out.println("echec! peut etre le compte selectionner n'existe pas!");	
}

}

public int id_banque;
public Banque(int id_B)
{
	this.id_banque =id_B;

}



}
