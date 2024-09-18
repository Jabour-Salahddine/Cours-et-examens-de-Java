package interfa;

public class Oiseau implements Animal {
    @Override
    public void manger() {
        System.out.println("L'oiseau mange");
    }

    @Override
    public void dormir() {
        System.out.println("L'oiseau dort");
    }

    public void voler() {
        System.out.println("L'oiseau vole");
    }

}