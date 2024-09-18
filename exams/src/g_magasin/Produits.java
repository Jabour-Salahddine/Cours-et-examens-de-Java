package g_magasin;

public class Produits {
private static int id_generateur=0;	
protected  int id_produit;
protected String nom;
protected int prix_vente;
protected int prix_achat;
protected int stock;

public Produits(String nom,int prix_vente,int prix_achat,int stock) {
this.nom=nom;
this.prix_achat=prix_achat;
this.prix_vente=prix_vente;
this.stock=stock;	
id_produit=++id_generateur;	
}

public Produits()
{id_produit++;}

//getter:

public int get_id()
{  
	return this.id_produit;

}


public String get_nom()
{  
	return this.nom;

}


public int get_prix_vente()
{  
	return this.prix_vente;

}


public int get_prix_achat()
{  
	return this.prix_achat;

}

public int get_stock()
{  
	return this.stock;

}

//setters:

public void set_nom(String nom)
{
	
   this.nom=nom;
}

public void set_prix_vente(int prix_vente)
{
	
   this.prix_vente=prix_vente;
}


public void set_prix_achat(int prix_achat)
{
	
   this.prix_achat=prix_achat;
}


public void set_stock(int stock)
{
	
   this.stock=stock;
}


	
	
}
