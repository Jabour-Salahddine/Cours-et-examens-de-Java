package interfa;

public class Mammifere implements Animal {

	@Override
    public void manger() {
        System.out.println("Le mammifère mange.");
    }

    @Override
    public void dormir() {
        System.out.println("Le mammifère dort.");
    }

    public void allaiter() {
        System.out.println("Le mammifère allaite.");
    }
	
	
}
