package interfa;

public class Main {

	public static void main(String[] args) {
		
		Zoo monZoo = new Zoo();

        // Ajouter quelques animaux au zoo
        Mammifere lion = new Mammifere();
        Oiseau aigle = new Oiseau();

        monZoo.ajouterAnimal(lion);
        monZoo.ajouterAnimal(aigle);

        // Nourrir tous les animaux du zoo
        monZoo.nourrirAnimaux();
       //afficher tout les animeaux:
        System.out.println("tout les animeaux dan notre Zoo : ");
	   for(int i=0;i<monZoo.animaux.size();i++)
	   {
		   System.out.println(monZoo.animaux.get(i));
		   
	   }
	
	}
}


