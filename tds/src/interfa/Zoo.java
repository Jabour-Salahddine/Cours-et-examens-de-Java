package interfa;
import java.util.ArrayList;

public class Zoo {
    public ArrayList<Animal> animaux;
    
    public Zoo() {
        this.animaux = new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void nourrirAnimaux() {
        System.out.println("Nourrir tous les animaux du zoo :");
        for (Animal animal : animaux) {
            animal.manger();
        }

    }



}
