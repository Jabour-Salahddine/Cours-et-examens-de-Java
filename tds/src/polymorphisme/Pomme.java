package polymorphisme;

public class Pomme extends Fruit {

	
	public Pomme(int i)
	{
		poids = i;
		x++;
		System.out.println("creation d'une pomme de"+poids+"grammes");
	}
	
	public void affiche()
	{ 
		System.out.println("c'est une pomme");
		
	}
	
	public void affichePoids() {
		System.out.println("le poid de la pomme est :"+poids+"grammes");
	}
	
	
}
