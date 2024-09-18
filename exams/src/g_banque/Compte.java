package g_banque;

public class Compte {
private int montant;
private int numero;
private String proprietaire;

public Compte(String proprietaire,int numero,int montant) 
{ 
	this.proprietaire=proprietaire;
	this.numero=numero;
	this.montant=montant;
	
}
	
public void modifier_montant(int somme)
{
 this.montant+=somme;	
}

public int get_montant()
{
	
  return this.montant;
}

public int get_numero() 
{
  return this.numero;	
}

public String get_proprietaire()
{
   return this.proprietaire;	
}

public String toString()
{
  return "Compte=[numero = "+this.numero+" ,montant= "+this.montant+" ,proprietaire= "+this.proprietaire+" ]";
  
}



	
}
