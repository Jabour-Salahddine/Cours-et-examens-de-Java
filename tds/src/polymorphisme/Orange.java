package polymorphisme;

public class Orange extends Fruit {

	
	public Orange(int i)
	{
		poids = i;
		
		System.out.println("creation d'une orange de"+poids+"grammes");
	}
	
	public void affiche()
	{ 
		System.out.println("c'est une Orange");
		
	}
	
	public void affichePoids() {
		System.out.println("le poid de l'Orange est :"+poids+"grammes");
	}
	
	
}
