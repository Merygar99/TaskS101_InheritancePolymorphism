package level1.exercise1.model;

public class WindInstrument extends Instrument {
    private static int num = 0;

    public WindInstrument(String name, double price) {
        super(name, price);
        num++;
    }

    @Override
    public void playInstrument() {
        System.out.println("A wind instrument is playing");
    }

    public static int counter() {
        return num;
    }

}
