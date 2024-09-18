package projet1;
// la place ou notre class est cree.                  
// "projet1" : le nom de fichier qui contient notre class
public class Phone {
// public : modifiaires determine l'accessibilité(ecrire et lire)...la variable est visible pour les autre class...
// private : la variable est accessible (ecrire et lire) juste pour la class ou elle est cree.	
// protected : accessible(ecrire et lire) juste pour les class qui apartient au meme package de la class mere...	  
	
	//attributs
      public String SE;   
	  public String nom;
      public int ram;
	  public double prix;
	  
	  // constracteur:
	  /*	  public Phone(String nom)
	  {
		  this.nom = nom;
		  
	  }
	  */
	  
	  
	  //dans ce cas au niveau de main lors de l'instantation c est impossible de travailler
	  //avec le constructeur avec des argument vide, si je veux garder les deux alors
	  //j'ajoute un sans argument:
	  /*public Phone() {}*/

	  
	  
	  
	  // methodes
	public void ring()
	{
	   System.out.println("ringing...");
	   
	
	}
	
	public void call() 
	{
		System.out.println("calling...");

	}
	
	// methode qui donne la valeur de ram:it's a getter
	
	public int getram()
	{
		return ram;
		
	}
	
	// methode pour affecter une valeur a l'attribut ram: it's a setter

	 public void setram(int ram)
	 {
		this.ram = ram; 
		 
	 }
	 
    // creation des constructeur:, si on utilise le constra qui est par dafaut
	 //parfois on reserve la ram pour un objet sans entrer ces donnee:
	 // Phone phone1 = new Phone();
	 //Phone phone2 = new Phone();  // la reservation est faite mais on a pas enter les info
	 //Phone phone3 = new Phone();  // perte de memoire
	                  // (le constructeur en dessus)
                          	           
	 
	 
	 

	}